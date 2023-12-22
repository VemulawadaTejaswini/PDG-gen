import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i,n,h,len;
        String s,sa,sb;
        while(true) {
        	s=scan.next();
        	if(s.equals("-")) {
        		break;
        	}
        	len=s.length();
        	n=scan.nextInt();
        	for(i=0;i<n;i++) {
        		h=scan.nextInt();
        		sa=s.substring(0,h);
        		sb=s.substring(h);
        		s=sb+sa;
        	}
        	System.out.println(s);
        }
    }
}
