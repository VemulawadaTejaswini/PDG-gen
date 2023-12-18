//問題３　2704 上石彩花
import java.util.Scanner;
public class Main{
	public void solve(){
		Scanner sc=new Scanner(System.in);
		int N,x,y,b,p;
		double w,goukei;
		
		w=0.8;
		N=sc.nextInt();
		
		for(int i=1;i<=N;i++){
		x=sc.nextInt();
		y=sc.nextInt();
		b=sc.nextInt();
		p=sc.nextInt();
			if(b>=5&&p>=2){
			goukei=(x*w*b)+(y*w*p);
			System.out.println(goukei);
			
		}else{
			goukei=(x*b)+(y*p);
			System.out.println(goukei);
		}
		}
	}
		public static void main(String[]args){
			Main obj=new Main();
			obj.solve();
		}
}