import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i,n;
        n=scan.nextInt();
        double x[]=new double[n],y[]=new double[n],p1=0,p2=0,p3=0,p=0;
        for(i=0;i<n;i++) {
        	x[i]=scan.nextDouble();
        }
        for(i=0;i<n;i++) {
        	y[i]=scan.nextDouble();
        }
        for(i=0;i<n;i++) {
        	p1+=Math.abs(x[i]-y[i]);
        	p2+=Math.pow(Math.abs(x[i]-y[i]),2);
        	p3+=Math.pow(Math.abs(x[i]-y[i]),3);
        	if(i==0) {
        		p=Math.abs(x[i]-y[i]);
        	}
        	else if(p<Math.abs(x[i]-y[i])) {
        		p=Math.abs(x[i]-y[i]);
        	}
        }
        System.out.println(p1);
        System.out.println(Math.sqrt(p2));
        System.out.println(Math.cbrt(p3));
        System.out.println(p);
    }
}
