import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Integer[] a = new Integer[N];
		//int[] a = new int[N];
		for(int i = 0; i < N; i++) a[i] = sc.nextInt();
		
		Arrays.sort(a,  Collections.reverseOrder());
		
		int alice = 0;
		int bob = 0;
		for(int i = 0; i < a.length; i++){
			if(i % 2 == 0) alice += a[i];
			else bob += a[i];
		}
		
		System.out.println(alice-bob);
	}
}