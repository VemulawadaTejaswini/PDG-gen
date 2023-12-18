import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		double A=sc.nextDouble();
		double B=sc.nextDouble();
		double H=sc.nextDouble();
		double M=sc.nextDouble();
		double Ar=(60*H+M)/2;
		double Br=M*6;
		double ans;
		if(Ar>Br) {
			double ans2;
			ans2=A*A+B*B-2*A*B*Math.cos(Math.toRadians(Ar-Br));
			ans=Math.sqrt(ans2);
		}
		else if(Ar==Br){
			ans=Math.abs(A-B);
		}
		else {
			double ans2;
			ans2=A*A+B*B-2*A*B*Math.cos(Math.toRadians(Br-Ar));
			ans=Math.sqrt(ans2);
		}
		System.out.println(ans);
	}
}
