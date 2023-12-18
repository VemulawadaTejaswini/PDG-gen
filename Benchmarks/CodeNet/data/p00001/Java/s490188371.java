import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	//0001
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer[] mountain = new Integer[10];
		for(int i = 0; i< 10;i++){
			mountain[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(mountain,Comparator.reverseOrder());

		for(int i=0;i<3;i++){
			System.out.println(mountain[i]);
		}
	}
}