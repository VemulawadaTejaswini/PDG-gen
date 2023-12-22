import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt(), x = sc.nextInt();
		
		for(int i = Math.max(-(int)1e6, x - k + 1), j = Math.min((int)1e6, x + k - 1); i <= j; i++)
			System.out.print(i + ( i == j ? "\n" : " "));
	}
}
