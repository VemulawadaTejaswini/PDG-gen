import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double x[]=new double[100],y[]=new double[100],s;
		int n=scan.nextInt(),i;
		for(i=0;i<n;i++) x[i]=scan.nextDouble();
		for(i=0;i<n;i++) y[i]=scan.nextDouble();
		scan.close();
		s=0;
		for(i=0;i<n;i++) s+=Math.abs(x[i]-y[i]);
		System.out.println(s);
		s=0;
		for(i=0;i<n;i++) s+=Math.pow(Math.abs(x[i]-y[i]), 2);
		System.out.println(Math.sqrt(s));
		s=0;
		for(i=0;i<n;i++) s+=Math.pow(Math.abs(x[i]-y[i]), 3);
		System.out.println(Math.pow(s, 1./3));
		s=0;
		for(i=0;i<n;i++) if(Math.abs(x[i]-y[i])>s) s=Math.abs(x[i]-y[i]);
		System.out.println(s);
	}
}
