import java.util.*;
import java.io.*;
class Main{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out, true);
		int temp = in.nextInt();
		if(temp >= 30)
			out.println("Yes");
		else
			out.println("No");
	}
}
