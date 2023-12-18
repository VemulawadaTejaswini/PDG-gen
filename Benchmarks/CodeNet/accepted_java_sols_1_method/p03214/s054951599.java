import java.util.Scanner;
public class Main{
	public static void main(String[]args){
	Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b[]=new int[a];
		double ans=0;
		for(int i=0;i<a;i++) {
			b[i]=scan.nextInt();
			ans+=b[i];
		}
		ans/=a;
		double min=1145141919;
		int minn=0;
		for(int i=0;i<a;i++) {
			if(Math.abs(b[i]-ans)<min) {
				min=Math.abs(b[i]-ans);
				minn=i;
			}
		}
		System.out.println(minn);
	}
}