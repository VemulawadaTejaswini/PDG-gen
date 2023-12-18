import java.util.Scanner;
public class Main {
	static int map[][];
	static int n;
	static int i;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int j,k,x,y;
		while(true){
			n=sc.nextInt();
			if(n==0) return;
			map=new int[n][n];
			for(j=0;j<n;j++){
				for(k=0;k<n;k++){
					map[j][k]=-1;
				}
			}
			x=y=n/2;
			y++;
			map[y][x]=1;
			magic(x+1,y+1,2);
			for(j=0;j<n;j++){
				for(k=0;k<n;k++){
					System.out.printf("%4d",map[j][k]);
				}
				System.out.println();
			}
		}
	}
	public static void magic(int x,int y,int i){
		if(i>n*n) return;
		
		if(n<=x){
			magic(0,y,i);
		}
		else if(x<0){
			magic(n-1,y,i);
		}
		else if(n<=y){
			magic(x,0,i);
		}
		else if(map[y][x]!=-1){
			magic(x-1,y+1,i);
		}
		else{
			map[y][x]=i;
			magic(x+1,y+1,i+1);
		}
	}
}