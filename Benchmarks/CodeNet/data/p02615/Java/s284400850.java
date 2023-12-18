
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i < n; i++)
			arr.add(in.nextInt());
		Collections.sort(arr);
		Collections.reverse(arr);
		
		int sum = 0;
		for(int i = 0; i < n - 1; i++)
			sum += arr.get(i);
		
		System.out.println(sum);
		

	}

}
