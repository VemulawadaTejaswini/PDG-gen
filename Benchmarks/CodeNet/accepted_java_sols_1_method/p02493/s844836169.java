import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		byte n = 0;
		
		try {
			n = in.nextByte();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		int[] data = new int[n];
		
		for (int i = 0; i < n; ++i) {
			try {
				data[i] = in.nextInt();
			} catch (Exception e) {
				e.printStackTrace();
				data[i] = 0;
			}
		}
		
		for (int i = n - 1; i != 0; --i)
			System.out.print(data[i] + " ");
		System.out.println(data[0]);
		
		in.close();
	}
}