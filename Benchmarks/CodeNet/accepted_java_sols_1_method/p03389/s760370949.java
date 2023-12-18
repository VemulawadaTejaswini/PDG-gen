import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tmpArray = br.readLine().split(" ");
		
		int a[] = new int[3];
		
		a[0] = Integer.parseInt(tmpArray[0]);
		a[1] = Integer.parseInt(tmpArray[1]);
		a[2] = Integer.parseInt(tmpArray[2]);
		
		Arrays.sort(a);

		int result = 0;
		
		while(!(a[0] == a[1] && a[0] == a[2])){
			if(a[0] <= a[2] - 2){
				a[0] += 2;
			}
			else {
				a[0]++;
				a[1]++;
			}
			
			result++;
			Arrays.sort(a);
		}
		
		System.out.println(result);
	}

}