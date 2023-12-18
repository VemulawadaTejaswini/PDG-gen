import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Integer[] a =new Integer[10];    //?????????????????????

		for(int i = 0; i < a.length; i++){
			a[i] = Integer.parseInt(br.readLine());
			if(a[i] < 0 || a[i] >10000){
				i--;
			}
		}

		Arrays.sort(a,Collections.reverseOrder());

		for(int i = 0; i < 3; i++){
			System.out.println(a[i]);
		}

	}
}