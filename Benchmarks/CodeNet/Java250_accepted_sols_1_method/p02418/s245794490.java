import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int ls,lp,i,j=0,f=0;
        String s,p;
        s=scan.next();
        p=scan.next();
        ls=s.length();
        lp=p.length();
        s=s+s+s;
        for(i=0;i<ls;i++) {
        	if(s.charAt(i)==p.charAt(0)) {
        		for(j=1;j<lp;j++) {
        			if(s.charAt(i+j)!=p.charAt(j)) {
        				break;
        			}
        		}
        	}
        	if(j==lp) {
        		f=1;
        		break;
        	}
        }
        if(f==1) {
        	System.out.println("Yes");
        }
        else {
        	System.out.println("No");
        }
    }
}
