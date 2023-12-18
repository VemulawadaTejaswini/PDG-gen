import java.io.PrintWriter;
import java.util.*;
public class Main{
	
	public static void main(String[]args) {
		PrintWriter out = new PrintWriter(System.out);
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		if(n>=30)out.println("Yes");
		else out.println("No");
		out.close();
	}
}