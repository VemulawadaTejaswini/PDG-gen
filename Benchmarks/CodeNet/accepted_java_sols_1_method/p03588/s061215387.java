import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Integer a[] = new Integer[num]; 
		int b[] = new int[num];
		for(int i = 0 ; i < num ; i++){
			String[] spl = br.readLine().split(" ");
			a[i] = Integer.parseInt(spl[0]);
			b[i] = Integer.parseInt(spl[1]);
		}
		Arrays.sort(a , Comparator.reverseOrder());
		Arrays.sort(b);
		int disp = a[0];
		disp += b[0];
		System.out.println(disp);
			
	}
}
