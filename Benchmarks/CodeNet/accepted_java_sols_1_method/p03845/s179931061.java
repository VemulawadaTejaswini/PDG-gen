import java.io.File;
import java.io.FileInputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long sum = 0;
		int[] T = new int[N];
		for(int i = 0; i < N; i++){
			T[i] = sc.nextInt();
			sum += T[i];
		}
		
		int M = sc.nextInt();
		for(int i = 0; i < M; i++){
			int P = sc.nextInt();
			int X = sc.nextInt();
			System.out.println(sum-T[P-1]+X);
		}
	}
}