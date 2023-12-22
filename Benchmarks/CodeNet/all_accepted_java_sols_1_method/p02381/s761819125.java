import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double s[]=new double[1000],t1,t2;
		int n,i;
		while(true) {
			n=scan.nextInt();
			if(n==0) break;
			t1=0;
			for(i=0;i<n;i++) {
				s[i]=scan.nextDouble();
				t1+=s[i];
			}
			t1/=n;
			t2=0;
			for(i=0;i<n;i++) t2+=Math.pow(s[i]-t1, 2);
			System.out.println(Math.sqrt(t2/n));
		}
		scan.close();
	}
}
