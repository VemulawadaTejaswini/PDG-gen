import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i,n,a=0,b=0;
        String sa,sb;
        n=scan.nextInt();
        for(i=0;i<n;i++) {
        	sa=scan.next();
        	sb=scan.next();
        	if(sa.compareTo(sb)>0) {
        		a+=3;
        	}
        	else if(sa.compareTo(sb)<0) {
        		b+=3;
        	}
        	else if(sa.compareTo(sb)==0) {
        		a+=1;
        		b+=1;
        	}
        }
        System.out.println(a+" "+b);
    }
}
