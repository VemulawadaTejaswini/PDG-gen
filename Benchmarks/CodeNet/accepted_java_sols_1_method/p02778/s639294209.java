import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		StringBuilder ab=new StringBuilder();
		for(int i=0; i<s.length(); i++){
			ab.append("x");
		}
		System.out.println(ab);
	}
}
