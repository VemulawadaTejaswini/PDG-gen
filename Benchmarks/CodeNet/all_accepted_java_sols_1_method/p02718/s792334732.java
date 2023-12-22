
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] as = br.readLine().split(" ");
		int n = Integer.parseInt(as[0]);
		int m = Integer.parseInt(as[1]);
		int[] array = new int[n];
		as = br.readLine().split(" ");
		int  sum = 0;
		for(int i = 0 ; i < n ; i++) {
			array[i]  = Integer.parseInt(as[i]);
			sum += array[i];
		}
		int kosu = 0;
		//System.out.println(sum);
		for(int i = 0 ; i < n ; i++) {
			if(array[i] >= ((double) sum/(4*m)) ) {
				kosu++;
			}
		}
		if(kosu >= m) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
