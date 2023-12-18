import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] freq = new int[101];
		while (sc.hasNext())
			freq[sc.nextInt()]++;
		int max = 0;
		for (int i = 1; i < freq.length; i++)
			max = Math.max(max, freq[i]);
		for (int i = 1; i < freq.length; i++)
			if (freq[i] == max) System.out.println(i);
	}

}