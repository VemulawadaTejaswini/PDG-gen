import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		int ans = 0;
		for(int i = a; i <= b; ++i) {
			if(c % i == 0) {
				++ans;
			}
		}
		System.out.println(ans);
	}
}
