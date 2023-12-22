import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> src = new ArrayList<>();
		for(int i=0;i<n;i++) {
				src.add(sc.nextInt());
		}
		ArrayList<Integer> array = new ArrayList<Integer>(src);
		
		Collections.sort(array);
		int max=array.get(n-1);
		int second=array.get(n-2);

		for(int i=0;i<n;i++) {
			if(max!=src.get(i))
			System.out.println(max);
			else 
				System.out.println(second);
		}

	}
}
