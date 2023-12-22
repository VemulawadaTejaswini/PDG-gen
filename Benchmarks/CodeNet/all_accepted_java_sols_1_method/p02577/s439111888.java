import java.util.*;
import java.io.*;
class Main{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out, true);
		String str = in.nextLine();
		int sum = 0;
		for(int i=0;i<str.length();i++){
			sum += str.charAt(i) - '0';
		}
		if(sum%9 == 0)
			out.println("Yes");
		else
			out.println("No");
	}
}
