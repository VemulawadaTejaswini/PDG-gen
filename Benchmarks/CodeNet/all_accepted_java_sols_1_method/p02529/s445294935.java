import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		String sArray[],tArray[];
		int n,q,count=0;

		str = br.readLine();
		n = Integer.parseInt(str);
		int numSArray[] = new int[n];

		str = br.readLine();
		sArray = str.trim().split(" ");

		/*
		for(int i=0; i<n; i++){
			numSArray[i] = Integer.parseInt(sArray[i]);
		}
		*/

		str = br.readLine();
		q = Integer.parseInt(str);
		int numTArray[] = new int[q];

		str = br.readLine();
		tArray = str.trim().split(" ");

		/*
		for(int i=0; i<q; i++){
			numTArray[i] = Integer.parseInt(tArray[i]);
		}
		*/

		for(int i=0; i<q; i++){
			for(int j=0; j<n; j++){
				if(tArray[i].equals(sArray[j])){
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}