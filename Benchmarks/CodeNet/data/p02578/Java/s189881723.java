import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] strs  = br.readLine().split(" ");
		
		int max = 0;
		int sum = 0;
		for(String str : strs){
			int n = Integer.parseInt(str);
			if(n < max){
				sum += max - n;
			}else{
				max = n;
			}
		}
		
		System.out.println(sum);
	}
}
