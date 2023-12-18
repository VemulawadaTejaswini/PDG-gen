import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main { 
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int count =n-1;
		
		String res = "";
		String[] num = new String[n];
		for(int i = 0;i<arr.length;i++){
			num[i] = (arr[count]);
			count--;
			res+=num[i]+" ";
		}
		System.out.println(res);
	}



}