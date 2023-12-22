import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean approved = true;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if ((x & 1) == 0 && (x % 3 != 0 && x % 5 != 0)) 
				approved = false;
		}
		if (approved) System.out.println("APPROVED");
		else System.out.println("DENIED");
	}
}
