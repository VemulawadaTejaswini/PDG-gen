import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		
		Scanner in = new Scanner(System.in);

		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int X = in.nextInt();
		int Y = in.nextInt();
		long ans = 0;
		
		int AB = Math.min(A + B, 2 * C);
		A = Math.min(A, AB);
		B = Math.min(B, AB);
		int XY = Math.min(X, Y);
		if(X >= 1 && Y >= 1) ans += XY * AB;
		
		if(X > Y){
			ans += (X - XY) * A;
		}else{
			ans += (Y - XY) * B;
		}
		
		System.out.println(ans);
	}
}