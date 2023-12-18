import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i,q,a,b,r,len;
        String str,com,p,sa,sb,sc;
        str=scan.next();
        q=scan.nextInt();
        for(i=0;i<q;i++) {
        	com=scan.next();
        	switch(com) {
        		case ("print"):
        			a=scan.nextInt();
        			b=scan.nextInt();
        			sa=str.substring(a,b+1);
        			System.out.println(sa);
        			break;
        		case ("reverse"):
        			a=scan.nextInt();
        			b=scan.nextInt();
        			sa=str.substring(0,a);
    				sb=str.substring(a,b+1);
    				sc=str.substring(b+1);
    				len=sb.length();
    				for(r=len-1;r>=0;r--) {
    					sa+=sb.substring(r,r+1);
    				}
    				str=sa+sc;
    				break;
        		case ("replace"):
        			a=scan.nextInt();
    				b=scan.nextInt();
    				p=scan.next();
    				sa=str.substring(0,a);
    				sb=str.substring(a,b+1);
    				sc=str.substring(b+1);
    				str=sa+p+sc;
        			break;
        		default :
        			break;
        	}
        }
    }
}
