import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		for(;;) {
		int a=scan.nextInt();
		if(a==0) {
			break;
		}
		double ans=0;
		int b[]=new int[a];
		double sum=0;
		for(int i=0;i<a;i++) {
			b[i]=scan.nextInt();
			sum+=b[i];
		}
		double hei=sum/a;
		for(int i=0;i<a;i++) {
			ans+=Math.pow(b[i]-hei,2);
		}
		ans=Math.sqrt(ans/a);
		System.out.println(ans);
	}
		}
}
