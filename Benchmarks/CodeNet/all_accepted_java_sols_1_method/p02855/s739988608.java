import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int H=stdIn.nextInt();
		int W=stdIn.nextInt();
		int K=stdIn.nextInt();
		char s[][]=new char[H][W];
		int A[][]=new int[K][2];
		int map[][]=new int[H][W];
		boolean h[]=new boolean[H];
		int z=0;
		for(int i=0;i<H;i++){
			String a=stdIn.next();
			for(int j=0;j<W;j++){
				s[i][j]=a.charAt(j);
				if(s[i][j]=='#'){
					h[i]=true;
					A[z][0]=i;
					A[z][1]=j;
					z++;
				}
			}
		}
		for(int i=0;i<K;i++){
			int u=A[i][0],d=u,l=A[i][1],r=l;
			map[u][l]=i+1;
			boolean uk=false,dk=false,rk=false,lk=false;
			while(true){
				if(u!=0&&h[u-1]==false){
					u--;uk=true;
				}
				if(d!=H-1&&h[d+1]==false){
					d++;dk=true;
				}
				for(int j=l;j<=r;j++){
					if(uk)
						if(map[u][j]!=0){
							u++;uk=false;
						}
					if(dk)
						if(map[d][j]!=0){
							d--;dk=false;
						}
				}
				if(r!=W-1){
					r++;rk=true;
				}
				if(l!=0){
					l--;lk=true;
				}
				for(int j=u;j<=d;j++){
					if(rk)
						if(map[j][r]!=0||s[j][r]=='#'){
							r--;rk=false;
						}
					if(lk)
						if(map[j][l]!=0||s[j][l]=='#'){
							l++;lk=false;
						}
				}
				if(rk==false&&lk==false&&uk==false&&dk==false){
					for(int j=u;j<=d;j++){
						for(int k=l;k<=r;k++){
							map[j][k]=i+1;
						}
					}
					break;
				}
				rk=false;lk=false;uk=false;dk=false;
			}
		}
		for(int i=0;i<H;i++){
			for(int j=0;j<W;j++){
				System.out.println(map[i][j]);
			}
		}
	}
}
