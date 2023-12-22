
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		int array[] =  new int[s.length];
		for(int i = 0 ; i< n ; i++) {
			array[i] = Integer.parseInt(s[i]);
		}
		int min = Integer.MAX_VALUE;
		int count = 0;
		for(int i = 0 ; i< n ; i++) {
			if(array[i] < min) {
				count++;
				min = array[i];
			}
		}
		System.out.println(count);
		
	}

}
