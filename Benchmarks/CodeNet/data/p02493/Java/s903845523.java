import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String space = " ";

		int n = Integer.parseInt(str);
		int temp;

		str = br.readLine();
		String[] strArray = str.split(" ");

		int numberArray[] = new int[n];

		for(int i = 0; i<n; i++){
			numberArray[i] = Integer.parseInt(strArray[i]);
		}

		for(int i=0, j=n-1; i<(n/2); i++,j--){
			temp=numberArray[i];
			numberArray[i] = numberArray[j];
			numberArray[j] = temp;
		}

		for(int i=0; i<n; i++){
			if(i!=0){
				System.out.print(" ");
			}
			System.out.print(numberArray[i]);
		}
	}
}