import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] data = new int[5];
		for ( int i = 0; i < 5; i++ )
			data[i] = sc.nextInt();
		Arrays.sort(data);
		System.out.println(data[4]+" "+data[3]+" "+data[2]+" "+data[1]+" "+data[0]);
	}
}