import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int n = Integer.parseInt(str);
		
		String[] arr = br.readLine().split(" ");
		
		
		
		
		
		int count = n-1;
		String out="";
		for(int i =0;i<arr.length;i++){
			out += arr[count]+" ";
			count--;
		}
		String result = out.trim();
		
		System.out.println(result);
	}
}