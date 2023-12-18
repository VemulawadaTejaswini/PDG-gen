import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	    Scanner std = new Scanner(System.in);
	    int a = Integer.parseInt(std.next());
	    int b = Integer.parseInt(std.next());
	    int c = Integer.parseInt(std.next());
	    boolean res = a<b && b<c;
	    if (res){
	    	System.out.println("Yes");
	    }else{
	    	System.out.println("No");
	    }
	}
}