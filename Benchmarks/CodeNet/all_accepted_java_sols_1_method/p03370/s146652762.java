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
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		int sum = 0;
		int min = 1001;
		int[] m = new int[N];
		for(int i = 0; i < N; i++){
			m[i] = sc.nextInt();
			sum += m[i];
			if(m[i] < min) min = m[i];
		}
		
		System.out.println((X - sum) / min + N);
	}
}