import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	String str=scan.next();
    	if(str.length()>=4) {
    		if(str.substring(0,4).equals("YAKI")) {
    			System.out.println("Yes");
    			return;
    		}
    	}
    	System.out.println("No");
    }
}