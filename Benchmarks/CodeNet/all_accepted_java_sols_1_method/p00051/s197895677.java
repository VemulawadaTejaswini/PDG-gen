
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < n ;i++){
			String line = br.readLine();
			char[] c = line.toCharArray();
			Arrays.sort(c);
			String min="",max="";
			for(int j = 0 ; j<c.length;j++){
				min += c[j];
				max += c[c.length-j-1];
			}
			int a = Integer.parseInt(min);
			int b = Integer.parseInt(max);
			System.out.println(b-a);
		}
	}

}