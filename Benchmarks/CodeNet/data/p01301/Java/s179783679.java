import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int w, d, h;
	int n, m=3;
	int[][][][] a;

	void run(){
		for(;;){
			w=sc.nextInt();
			d=sc.nextInt();
			h=sc.nextInt();
			n=sc.nextInt();
			if((w|d|h|n)==0){
				break;
			}
			int sum=0;
			a=new int[n][m][m][m];
			for(int t=0; t<n; t++){
				int x=sc.nextInt(), y=sc.nextInt(), z=sc.nextInt();
				for(int k=0; k<z; k++){
					for(int j=0; j<y; j++){
						String s=sc.next();
						for(int i=0; i<x; i++){
							a[t][k][j][i]=s.charAt(i)=='*'?1:0;
							sum+=a[t][k][j][i];
						}
					}
				}
			}
			solve();
		}
	}

	void solve(){
		// a[t]を回転させたのを作りたい
		HashSet<String> set=new HashSet<String>();
		ArrayList<ArrayList<Integer>> lists=new ArrayList<ArrayList<Integer>>();
		int cal=0;
		for(int t=0; t<n; t++){
			for(int rotX=0; rotX<4; rotX++){
				rotX(a[t]);
				for(int rotY=0; rotY<4; rotY++){
					rotY(a[t]);
					for(int rotZ=0; rotZ<4; rotZ++){
						rotZ(a[t]);
						int minX=m, maxX=0, minY=m, maxY=0, minZ=m, maxZ=0;
						for(int x=0; x<m; x++){
							for(int y=0; y<m; y++){
								for(int z=0; z<m; z++){
									if(a[t][z][y][x]==1){
										minX=min(minX, x);
										maxX=max(maxX, x);
										minY=min(minY, y);
										maxY=max(maxY, y);
										minZ=min(minZ, z);
										maxZ=max(maxZ, z);
									}
								}
							}
						}
						for(int dx=-w; dx<=w; dx++){
							for(int dy=-d; dy<=d; dy++){
								for(int dz=-h; dz<=h; dz++){
									if(in(minX+dx, w)&&in(maxX+dx, w)
											&&in(minY+dy, d)&&in(maxY+dy, d)
											&&in(minZ+dz, h)&&in(maxZ+dz, h)){}else{
										continue;
									}
									cal++;
									StringBuilder sb=new StringBuilder();
									ArrayList<Integer> is=new ArrayList<Integer>();
									for(int x=0; x<m; x++){
										for(int y=0; y<m; y++){
											for(int z=0; z<m; z++){
												if(a[t][z][y][x]==1){
													cal++;
													int p=(z+dz)*m*m+(y+dy)*m
															+(x+dx);
													is.add(p);
													sb.append(p).append(',');
												}
											}
										}
									}
									is.add(w*d*h+t);
									sb.append(w*d*h+t).append(',');
									String hash=sb.toString();
									if(!set.contains(hash)){
										set.add(hash);
										// debug(is);
										lists.add(is);
									}
								}
							}
						}
					}
				}
			}
		}
		println(solve(lists, w*d*h+n)?"Yes":"No");
	}

	boolean in(int p, int up){
		return p>=0&&p<up;
	}

	void rotX(int[][][] a){
		for(int k=0; k<m; k++){
			for(int j=0; j<m/2; j++){
				for(int i=0; i<m/2+m%2; i++){
					int t=a[j][i][k];
					a[j][i][k]=a[m-1-i][j][k];
					a[m-1-i][j][k]=a[m-1-j][m-1-i][k];
					a[m-1-j][m-1-i][k]=a[i][m-1-j][k];
					a[i][m-1-j][k]=t;
				}
			}
		}
	}

	void rotY(int[][][] a){
		for(int k=0; k<m; k++){
			for(int j=0; j<m/2; j++){
				for(int i=0; i<m/2+m%2; i++){
					int t=a[j][k][i];
					a[j][k][i]=a[m-1-i][k][j];
					a[m-1-i][k][j]=a[m-1-j][k][m-1-i];
					a[m-1-j][k][m-1-i]=a[i][k][m-1-j];
					a[i][k][m-1-j]=t;
				}
			}
		}
	}

	void rotZ(int[][][] a){
		for(int k=0; k<m; k++){
			for(int j=0; j<m/2; j++){
				for(int i=0; i<m/2+m%2; i++){
					int t=a[k][j][i];
					a[k][j][i]=a[k][m-1-i][j];
					a[k][m-1-i][j]=a[k][m-1-j][m-1-i];
					a[k][m-1-j][m-1-i]=a[k][i][m-1-j];
					a[k][i][m-1-j]=t;
				}
			}
		}
	}

	V head;
	V[] cols, rows;
	int[] count, set;

	boolean solve(ArrayList<ArrayList<Integer>> lists, int m){
		int n=lists.size();
		head=new V(-1, -1);
		cols=new V[m];
		rows=new V[n];
		for(int i=0; i<m; i++){
			cols[i]=new V(i, -1);
			cols[i].connectX(head);
		}
		for(int i=0; i<n; i++){
			rows[i]=new V(-1, i);
			rows[i].connectY(head);
		}
		count=new int[m];
		for(int j=0; j<n; j++){
			for(int i : lists.get(j)){
				V v=new V(i, j);
				v.connectX(rows[j]);
				v.connectY(cols[i]);
				count[i]++;
			}
		}
		set=new int[n];
		fill(set, -1);
		return rec(0);
	}

	boolean rec(int depth){
		if(head==head.right){
			// debug("OK");
			return true;
		}
		V col=head.right;
		for(V v=head.right; v!=head; v=v.right){
			if(count[v.x]==0)
				return false;
		}
		for(V v=head.right; v!=head; v=v.right){
			if(count[v.x]==0)
				return false;
			if(count[v.x]<count[col.x]){
				col=v;
				if(count[v.x]<=1)
					break;
			}
		}
		for(V v=col.down; v!=col; v=v.down){
			for(V u=rows[v.y].right; u!=rows[v.y]; u=u.right)
				cols[u.x].cover();
			set[depth]=v.y;
			if(rec(depth+1)){
				for(V u=rows[v.y].left; u!=rows[v.y]; u=u.left)
					cols[u.x].uncover();
				return true;
			}
			set[depth]=-1;
			for(V u=rows[v.y].left; u!=rows[v.y]; u=u.left)
				cols[u.x].uncover();
		}
		return false;
	}

	class V{
		int x, y;
		V up, down, left, right;

		V(int x, int y){
			this.x=x;
			this.y=y;
			up=down=left=right=this;
		}

		void cover(){
			left.right=right;
			right.left=left;
			for(V v=down; v!=this; v=v.down){
				for(V u=v.right; u!=v; u=u.right){
					u.up.down=u.down;
					u.down.up=u.up;
					if(u.x>=0)
						count[u.x]--;
				}
			}
		}

		void uncover(){
			for(V v=down; v!=this; v=v.down){
				for(V u=v.right; u!=v; u=u.right){
					u.up.down=u.down.up=u;
					if(u.x>=0)
						count[u.x]++;
				}
			}
			left.right=right.left=this;
		}

		void connectX(V v){
			left=v.left;
			right=v;
			left.right=right.left=this;
		}

		void connectY(V v){
			up=v.up;
			down=v;
			up.down=down.up=this;
		}
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}