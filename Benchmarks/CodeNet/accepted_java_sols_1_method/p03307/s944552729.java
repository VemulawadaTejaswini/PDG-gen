import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		for (int i = 1; true; i++) {
			if (n*i % 2 == 0) {
				System.out.println(n*i);
				break;
			}
		}
	}
}
