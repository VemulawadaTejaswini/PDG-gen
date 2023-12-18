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
		
		int N = in.nextInt();
		int min = 1001, max = -1;
		for(int i = 0; i < N; i++){
			int a = in.nextInt();
			min = Math.min(min, a);
			max = Math.max(max, a);
		}
		System.out.println(max-min);
	}
}
