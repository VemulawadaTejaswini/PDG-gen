import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(sc.nextLine());
		for (int i=0; i<sb.length(); i++) {
			char c = sb.charAt(i);
			if (c>=65&&c<=90) {sb.replace(i,i+1,String.valueOf(c).toLowerCase());}
			else if (c>=97&&c<=122) {sb.replace(i,i+1,String.valueOf(c).toUpperCase());}
		}
		System.out.println(sb);
	}
}
