import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class Main {
	static final int K = 10000;
	public static void main(String[] args) throws NumberFormatException, IOException {
		//System.setIn(new FileInputStream("./ALDS1_6_A-in8.txt"));
		/*
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long start = System.nanoTime();
		int[] c = new int[K + 1];
		for(int i = 0; i < n; ++i) {
			c[Integer.parseInt(sc.next())] += 1;
		}
		sc.close();
		System.out.println((System.nanoTime() - start)/1000/1000 + " ms");
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "US-ASCII"), 20*2000000);
		int n = Integer.parseInt(br.readLine());
		
		//long start = System.nanoTime();
		int[] c = new int[K + 1];
		String[] l = br.readLine().split(" ");
		
		for(int i = 0; i < n; ++i) {
			c[Integer.parseInt(l[i])] += 1;
		}
		//System.out.println((System.nanoTime() - start)/1000/1000 + " ms");


		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i <= K; ++i) {
			while(c[i] > 0){
				sb.append(i);
				sb.append(" ");
				c[i] -= 1;
			}
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb);
	}

}