import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder(sc.nextLine());
		for(int i=1;i<sb.length();i++) {
			sb.deleteCharAt(i);
		}
		System.out.println(sb.toString());
	}
}