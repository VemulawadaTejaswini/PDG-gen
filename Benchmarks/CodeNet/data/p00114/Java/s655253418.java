import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ans,i;
		int a[]=new int[3];
		int m[]=new int[3];
		while(true){
			for(i=0;i<3;i++){
				a[i]=sc.nextInt();
				m[i]=sc.nextInt();
			}
			if(a[0]==0 && m[0]==0 && a[1]==0 && m[1]==0 && a[2]==0 && m[2]==0){
				break;
			}
			ans=fly(a[0], m[0], a[1], m[1], a[2], m[2]);
			System.out.println(ans);
		}
	}
	public static int fly(int a1,int m1,int a2,int m2,int a3,int m3){
		int cnt=0;
		int x,y,z;
		x=y=z=1;
		while(true){
			x=(a1*x)%m1;
			y=(a2*y)%m2;
			z=(a3*z)%m3;
			cnt++;
			if(x==1 && y==1 && z==1) break;
		}
		return cnt;
	}
}