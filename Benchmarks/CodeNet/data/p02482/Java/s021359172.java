import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new java.util.Scanner(System.in);
		String s1 = sc.nextLine();
		String[] s2 = s1.split("[\\s]+");
		Integer a = new Integer(s2[0]);
		Integer b = new Integer(s2[1]);
		
		if(a<b) System.out.println("a < b");
		if(a>b) System.out.println("a > b");
		if(a==b) System.out.println("a == b");
	}
}