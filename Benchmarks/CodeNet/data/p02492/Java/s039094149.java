import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] s2 = s.split("[\\s]+");
		Integer a = new Integer(s2[0]);
		Integer b = new Integer(s2[2]);
		if(!s2[1].equals("?")){
			if(s2[1].equals("+"))System.out.println(a+b);
			else if(s2[1].equals("-"))System.out.println(a-b);
			else if(s2[1].equals("*"))System.out.println(a*b);
			else if (s2[1].equals("/"))System.out.println(a/b);
		}
	}
}