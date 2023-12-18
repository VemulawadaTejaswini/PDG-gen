import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);

		//配列array
		ArrayList<Integer> array = new ArrayList<Integer>();

		int n  = src.nextInt();

		//nに入力された数だけ繰り返し、配列に要素を代入
		for(int i=0; i<n; i++) {
			array.add(src.nextInt());
		}

		int q = src.nextInt();

		for(int i=0; i<q; i++) {

			int b = src.nextInt();
			int e = src.nextInt();
			int k = src.nextInt();

			int count = 0;
			
			for(int j = b; j < e; j++)
				if(array.get(j).equals(k))
					count++;
			System.out.println(count);
		}
	}
}
