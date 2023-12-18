import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class Main{
	
	public static void main(String[] args) throws IOException{
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		long[] An = new long[N];
		for(int i = 0; i < N; i++) An[i] = in.nextLong() - (i + 1);
		
		Arrays.sort(An);
		long b = An[N / 2];
		long sum = 0;
		for(int i = 0; i < N; i++) sum += Math.abs(An[i] - b);
		System.out.println(sum);
	}
}
