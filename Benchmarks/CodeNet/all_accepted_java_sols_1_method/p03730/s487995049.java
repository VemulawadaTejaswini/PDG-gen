import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		while((str = br.readLine()) != null){
			String array[] = str.split(" ");
			int a = Integer.parseInt(array[0]);
			int b = Integer.parseInt(array[1]);
			int c = Integer.parseInt(array[2]);
			int baisuu = 1;
			while(true){
				if((a*baisuu)%b ==  c){
					System.out.println("YES");
					break;
				}else if((a*baisuu)%b ==  c || (a*baisuu)%b ==  0){
					System.out.println("NO");
					break;
				}
				baisuu++;
			}
		}
	}
}
