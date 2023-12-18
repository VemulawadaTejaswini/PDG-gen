import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder(sc.nextLine());
		int last=sb.lastIndexOf("Z");
		int first=sb.indexOf("A");
		System.out.println(last-first+1);
	}
}