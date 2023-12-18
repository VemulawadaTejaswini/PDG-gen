import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) {
		int MAX = 51000 ;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		int[] prime = new int[MAX + 1];
		
		try {
			//エラトステネスの篩
			for(int i = 2; i * i <= MAX; i++ ){
		      if(prime[i] == 1 ) continue ;
		      for(int j = i * 2; j <= MAX; j += i ) prime[j] = 1;
		    }
			
			while ((line = br.readLine()) != null) {
				line = line.trim();
				int num = Integer.parseInt(line);
				
				for(int i = 1; num - i  > 1; i++) {
					if(prime[num - i] == 0) {
						System.out.print((num - i) + " ");
						break;
					}
				}
				for(int i = 1; num + i  < 51000; i++) {
					if(prime[num + i] == 0) {
						System.out.println((num + i));
						break;
					}
				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}