import java.io.IOException;
import java.util.Scanner;

public class Main {
	static final int K = 10000;
	public static void main(String[] args) throws NumberFormatException, IOException {
		//System.setIn(new FileInputStream("./ALDS1_6_A-in8.txt"));
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		
		int[] c = new int[K + 1];
		for(int i = 0; i < n; ++i) {
			c[Integer.parseInt(sc.next())] += 1;
		}
		sc.close();
		
		StringBuilder sb = new StringBuilder();
		//long start = System.nanoTime();
		for(int i = 0; i <= K; ++i) {
			while(c[i] > 0){
				sb.append(i);
				sb.append(" ");
				c[i] -= 1;
			}
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb);
		//System.out.println((System.nanoTime() - start)/1000/1000 + " ms");
	}

}