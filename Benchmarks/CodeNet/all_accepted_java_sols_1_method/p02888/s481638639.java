import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = sc.nextInt();
		Integer[] tmep = new Integer[n];
		for(int i = 0; i < n; i++)
			tmep[i] = sc.nextInt();
		Arrays.sort(tmep);
		
		int[] array = new int[n];
		for(int i = 0; i < n; i++)
			array[i] = tmep[i];
		
		long count = 0;
		
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for(int i = 0; i < n; i++)
			if(!map.containsKey(array[i]))
				map.put(array[i], i);
		
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				
				int max = array[i] + array[j];
				int y = Arrays.binarySearch(array, max);
				
				if(y < 0)
					y = -(y + 1);
				
				if(y != array.length)
					y = map.get(array[y]) - 1;
				else
					y--;
				
				count += y - j;
			}
		}
		
		System.out.println(count);
	}
}