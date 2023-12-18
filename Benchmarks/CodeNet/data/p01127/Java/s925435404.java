import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int ds=0;ds<n;ds++){
			int h = sc.nextInt();
			int w = sc.nextInt();
			char[][] map = new char[h][w];
			for(int i=0;i<h;i++) map[i] = sc.next().toCharArray();
			
			int[] maxx = new int[7];
			int[] minx = new int[7];
			int[] maxy = new int[7];
			int[] miny = new int[7];
			Arrays.fill(minx, 51);
			Arrays.fill(miny, 51);
			ArrayList<Character> list = new ArrayList<Character>();
			
			int p, q;
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(map[i][j]!='.'){
						if(list.contains(map[i][j])==false) list.add(map[i][j]);
						p = list.indexOf(map[i][j]);
						maxx[p] = Math.max(maxx[p], j);
						minx[p] = Math.min(minx[p], j);
						maxy[p] = Math.max(maxy[p], i);
						miny[p] = Math.min(miny[p], i);
					}
				}
			}
			
			boolean flag = true;
			ArrayList<Integer> z = new ArrayList<Integer>();
			p = list.size();
			for(int k=0;k<p;k++){
				for(int i=miny[k];i<=maxy[k];i++){
					for(int j=minx[k];j<=maxx[k];j++){
						if(map[i][j]=='.'){
							flag = false;
							i = maxy[k]+1;
							j = maxx[k]+1;
							k = p;
						}else if(map[i][j]!=list.get(k)){
							q = 10*k + list.indexOf(map[i][j]);
							if(z.contains(q)==false) z.add(q);
						}
					}
				}
			}
			
			if(flag==true){
				q = z.size();
				int[] a = new int[q];
				int[] b = new int[q];
				int[] c = new int[p];
				for(int i=0;i<q;i++){
					a[i] = z.get(i)/10;
					b[i] = z.get(i)%10;
				}
				for(int i=0;i<p;i++) c[i] = i;
				z.clear();
				
				boolean check;
				int rec;
				int temp;
				while(true){
					temp = 1;
					rec = 0;
					for(int i=0;i<p;i++){
						rec += c[i]*temp;
						temp *= 10;
					}
					if(z.contains(rec)==true){
						flag = false;
						break;
					}else{
						z.add(rec);
						flag = true;
						for(int i=0;i<q;i++){
							check = false;
							for(int j=0;j<p;j++){
								if(c[j]==b[i]){
									check = true;
									rec = j;
								}else if(c[j]==a[i]){
									if(check==true){
										temp = c[rec];
										c[rec] = c[j];
										c[j] = temp;
										flag = false;
									}
									break;
								}
							}
						}
						if(flag==true) break;
					}
				}
			}
			
			if(flag==true) System.out.println("SAFE");
			else System.out.println("SUSPICIOUS");
		}	
	}	
}