import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		String sArray[],tArray[];
		int count=0;

		int n = Integer.parseInt(br.readLine());
		int numSArray[] = new int[n];
		sArray = br.readLine().split(" ");
		for(int i=0; i<n; i++){
			numSArray[i] = Integer.parseInt(sArray[i]);
		}

		int q = Integer.parseInt(br.readLine());
		int numTArray[] = new int[q];
		tArray = br.readLine().split(" ");
		for(int i=0; i<q; i++){
			numTArray[i] = Integer.parseInt(tArray[i]);
		}

		for(int i=0; i<q; i++){
			for(int j=0; j<n; j++){
				if(numTArray[i] == numSArray[j])
					count++;
			}
		}

		System.out.println(count);

	}
}