
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String str = br.readLine();
			int max = Integer.parseInt(str);

			for(int i=0;i<=max;i++){
				if(i==0)continue;
				if((i%3==0)||(i%10==3)){
					System.out.print(" "+i);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}