import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next(), b = sc.next();
		if(a.length() < b.length())System.out.print("LESS");
		else if(a.length() > b.length())System.out.print("GREATER");
		else if(a.compareTo(b)<0)System.out.print("LESS");
		else if(a.compareTo(b)>0)System.out.print("GREATER");
		else System.out.print("EQUAL");
	}

}