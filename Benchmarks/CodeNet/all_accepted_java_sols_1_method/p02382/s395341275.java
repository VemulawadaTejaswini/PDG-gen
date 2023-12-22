import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.next());
		double x[]=new double[n];
		double y[]=new double[n];
		for(int i=0;i<n;i++) {
			x[i]=Double.parseDouble(sc.next());
		}
		for(int i=0;i<n;i++) {
			y[i]=Double.parseDouble(sc.next());
		}
		double m1=0;
		double m2=0;
		double m3=0;
		double c=0;
		for(int i=0;i<n;i++) {
			m1+=Math.abs(x[i]-y[i]);
		}

		for(int i=0;i<n;i++) {
			m2+=Math.pow(Math.abs(x[i]-y[i]),2);
		}
		m2=Math.sqrt(m2);

		for(int i=0;i<n;i++) {
			m3+=Math.pow(Math.abs(x[i]-y[i]),3);
		}
		m3=Math.cbrt(m3);

		for(int i=0;i<n;i++) {
			if(c<Math.abs(x[i]-y[i])) {
				c=Math.abs(x[i]-y[i]);
			}
		}
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(c);
	}

}

