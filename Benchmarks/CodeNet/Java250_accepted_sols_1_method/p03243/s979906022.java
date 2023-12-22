import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while( (n%10) != (n/10)%10 || ((n/10)%10) != (n/100)%10 )n++;
		
		System.out.println(n);
	}
}
