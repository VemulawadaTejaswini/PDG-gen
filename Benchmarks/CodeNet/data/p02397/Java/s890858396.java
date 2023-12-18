import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a==0&&b==0) {break;}
			if(a<b) {System.out.println(a+" "+b);}
			else if(b<a) {System.out.println(b+" "+a);}
		}
	}
}

