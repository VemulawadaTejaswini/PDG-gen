import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String[] s2 = s1.split("[\\s]+");
		Integer a = new Integer(s2[0]);
		Integer b = new Integer(s2[1]);
		System.out.println(a/b+" "+a%b+" "+(float)a/(float)b);
	}
}