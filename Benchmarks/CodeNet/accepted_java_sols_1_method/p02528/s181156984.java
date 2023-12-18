import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		int n = Integer.parseInt(str);
		int intArray[] = new int[n];

		str = br.readLine();

		String numArray[] = str.split(" ");

		for(int i=0; i<n; i++){
			intArray[i] = Integer.parseInt(numArray[i]);
		}

		Arrays.sort(intArray);

		for(int i=0; i<n; i++){
			if(i != (n-1)){
				System.out.print(intArray[i] + " ");
			}else{
				System.out.println(intArray[i]);
			}
		}
	}
}