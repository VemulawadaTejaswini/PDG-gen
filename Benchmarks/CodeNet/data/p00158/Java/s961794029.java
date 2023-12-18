import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = "";
		while((str=br.readLine())!=null){

			int ans = Integer.parseInt(str);

			if(ans == 0) break;

			int cnt = 0;
			while(true){
				if(ans == 1) break;

				if(ans % 2 == 0){
					ans /= 2;
				} else{
					ans = ans * 3 + 1;
				}
				cnt++;
			}

			System.out.println(cnt);
		}
	}
}