import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		S = S.replaceAll("-","");
		if(S.equals(""))System.out.println("-4");
		if(S.equals("+"))System.out.println("-2");
		if(S.equals("++"))System.out.println("0");
		if(S.equals("+++"))System.out.println("2");
		if(S.equals("++++"))System.out.println("4");
	}
}