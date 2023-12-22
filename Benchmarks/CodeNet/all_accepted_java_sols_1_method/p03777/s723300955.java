import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next(),b=sc.next();
		System.out.println((a.equals(b))?"H":"D");
		sc.close();
	}
}