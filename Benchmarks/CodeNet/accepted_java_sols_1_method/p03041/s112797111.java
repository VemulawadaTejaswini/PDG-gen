import java.util.Scanner;
//2-3
public class Main{
    public static void main(String [] args){
    	Scanner scan=new Scanner(System.in);
    	int n=scan.nextInt();
    	int k=scan.nextInt()-1;
    	String s=scan.next();
    	String ans="";
    	char a;
    	int b=0;
    	for(int i=0;i<n;i++) {
    		a=s.charAt(i);
    		if(i==k) {
    			b=a+32;
    			a=(char) b;
    		}
    		//System.out.println(a);
    		ans=ans+a;
    	}
    	System.out.println(ans);
    }
}