import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		char[] carray = str.toCharArray();
		for(int i = 0, k = carray.length ; i < k ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(carray[i] =='Z') {
					carray[i]='A';
				}else {
					carray[i]++;
				}
			}
		}
		String result = "";
		for(int i = 0, k = carray.length ; i<k;i++) {
			result += carray[i];					
		}
		System.out.println(result);
	}

}
