import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] data = new int[5];
		for ( int i = 0; i < 5; i++ )
			data[i] = sc.nextInt();
		Arrays.sort(data);
		for ( int i = data.length-1; i >= 0; i-- )
			System.out.print(data[i]+" ");
		System.out.println("");
	}
}