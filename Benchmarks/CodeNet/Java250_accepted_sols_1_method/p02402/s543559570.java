import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int min = 1000000;
		int max = -1000000;
		long sum = 0;
		for(int i = 0; i < n; i++){
			int in = sc.nextInt();
			sum += in;
			if(in < min) min = in;
			if(in > max) max = in;
		}
		System.out.println(min + " " + max + " " + sum);
	}
}
