import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);

		for(int i=0; i<n; i++){
			System.out.println(dif(br.readLine()));
		}

	}

	static int dif(String st){
		char data[] = st.toCharArray();
		Arrays.sort(data);
		String big="",small="";
		int B,S;

		for(int i=0; i<data.length; i++){
			small += data[i];
		}

		for(int j=data.length-1; j>-1; j--){
			big += data[j];
		}

		B = Integer.parseInt(big);
		S = Integer.parseInt(small);

		return B-S;
	}
}