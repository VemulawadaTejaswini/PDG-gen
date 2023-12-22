import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		char c=in.next().charAt(0);
		if(c>='A' && c<='Z')	System.out.print("A");
		else System.out.print("a");
	}
}