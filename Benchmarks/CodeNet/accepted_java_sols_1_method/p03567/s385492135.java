import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	String str=scan.next();
    	for(int i=0;i!=str.length()-1;i++) {
    		if(str.charAt(i)=='A'&&str.charAt(i+1)=='C') {
    			System.out.println("Yes");
    			return;
    		}
    	}
    	System.out.println("No");
    }
}