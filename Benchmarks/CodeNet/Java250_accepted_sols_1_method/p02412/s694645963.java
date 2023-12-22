import java.io.*;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int count = 0;
			String line = br.readLine();
			String[] spl = line.split(" ");
			int n = Integer.parseInt(spl[0]);
			int x = Integer.parseInt(spl[1]);
			if(n == 0 && x == 0){break;}
			for (int i = 1 ; i <= (n-2) ; i++ ) {
				for (int j = i+1 ; j<= (n-1) ; j++ ) {
					for (int k = j+1 ; k <= n ; k++) {
						if(i + j + k == x){
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}