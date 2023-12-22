import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		String[] line = br.readLine().split(" ");
		int a = Integer.parseInt(line[0]);
		int b = Integer.parseInt(line[1]);
		
		br.close();

		float price;
		
		for(int i = 0;i<10000;i++) {
			if((int)(i*0.08) == a && (int)(i*0.10) == b) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}
}
