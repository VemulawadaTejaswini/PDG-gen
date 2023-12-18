import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i,n;
        double sum,a,m,sig,sigma;
        while(true) {
        	sum=0;
        	sig=0;
        	n=scan.nextInt();
        	if(n==0) {
        		break;
        	}
        	double s[]=new double[n];
        	for(i=0;i<n;i++) {
        		s[i]=scan.nextDouble();
        		sum+=s[i];
        	}
        	m=sum/n;
        	for(i=0;i<n;i++) {
        		sigma=Math.pow(s[i]-m,2);
        		sig+=sigma;
        	}
        	a=Math.sqrt(sig/n);
        	System.out.println(a);
        }
    }
}
