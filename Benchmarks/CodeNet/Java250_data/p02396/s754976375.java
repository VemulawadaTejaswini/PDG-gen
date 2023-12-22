import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i=0;
		int num = 1;
		while(true){
			String str = br.readLine();
			num = Integer.parseInt(str);

				if(num == 0){
					break;
				}
				else if(num != 0){
					i++;
					System.out.println("Case " + i + ": " + num);
				}
		}
	}
}