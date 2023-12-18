import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		long k = sc.nextLong();
		long cur = 7 % k;
		for(int i = 1; i < 1e7; i++) {
			if(cur == 0) {
				System.out.println(i);
				return;
			}
			cur = (cur*10+7)%k;
		}
		System.out.println(-1);
	}
}
