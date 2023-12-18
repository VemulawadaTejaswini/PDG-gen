import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int n = Integer.parseInt(br.readLine());
			String buf = br.readLine();
			StringTokenizer tnz = new StringTokenizer(buf);
			int[] numbers = new int[n];
			for (int i=0;i<n;i++) {
				numbers[i] = Integer.parseInt(tnz.nextToken());
			}
			Arrays.sort(numbers);
			if (n==2) {
				System.out.println(1);
				for (int i=2;i<=(numbers[0]/2);i++) {
					if (numbers[0]%i==0&&numbers[1]%i==0) {
						System.out.println(i);
					}
				}
				if (numbers[1]%numbers[0]==0) {
					System.out.println(numbers[0]);
				}
			}
			else if (n==3) {
				System.out.println(1);
				for (int i=2;i<=(numbers[0]/2);i++) {
					if (numbers[0]%i==0&&numbers[1]%i==0&&numbers[2]%i==0) {
						System.out.println(i);
					}
				}
				if (numbers[1]%numbers[0]==0&&numbers[2]%numbers[0]==0) {
					System.out.println(numbers[0]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

