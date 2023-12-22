import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char stdin[] = br.readLine().toCharArray();
		for (int i=0; i<stdin.length; i++){
			if(stdin[i] > 'C'){
				stdin[i] -= 3;
			}else{
				stdin[i] += 23;
			}
		}
		System.out.println(String.valueOf(stdin));
	}
}