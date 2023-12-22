import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String data[] = reader.readLine().split(" ");
		int a= Integer.parseInt(data[0]);
		int b= Integer.parseInt(data[1]);
		int c= Integer.parseInt(data[2]);
			
		int ans=0;
		for(int i=a; i<=b; i++){
			if(c%i==0)
				ans++;
		}
		System.out.println(Integer.toString(ans));
	}
}