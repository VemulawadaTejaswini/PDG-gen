import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		fun(n);
	}
	public static void fun(long n) {
		if(n<27) {
			System.out.print((char)(n+96));
			return;
		}else if(n<703) {
			if(n%26!=0) {
			System.out.print((char)(n/26 + 96));
			System.out.print((char)(n%26 + 96));}
			else {
				System.out.print((char)(n/26 + 95));
				System.out.print((char)(26 + 96));
				return;
			}
		}else {
			if(n%26!=0) {
			fun(n/26);
			System.out.print((char)(n%26 + 96));}
			else {
				fun(n/26 - 1);
				System.out.print((char)(26 + 96));}
			return;
		}
	}
}	