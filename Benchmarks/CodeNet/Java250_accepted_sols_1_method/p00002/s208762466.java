import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while ((line = br.readLine()) != null) {
			String[] numbers = line.split(" ");
			int sum = 0;
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);
            sum = a + b;
            
            int ans = 1;
            while((sum /= 10) > 0){
            	ans++;
            }
            System.out.println(ans);
        }
	}
}