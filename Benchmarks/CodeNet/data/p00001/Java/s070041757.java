import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] hights = new int[10];

		for(int i = 0 ; i < 10 ; i++){
			hights[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(hights);

		for(int i = 9; i > 6 ; i--){
			System.out.println(hights[i]);
		}

	}

}