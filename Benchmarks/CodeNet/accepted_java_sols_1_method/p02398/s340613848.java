import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String str =br.readLine();
		String[] stra = str.split(" ");
		
		int a = Integer.parseInt(stra[0]);
		int b = Integer.parseInt(stra[1]);
		int c = Integer.parseInt(stra[2]);
		int cnt = 0;
		for (int i = a ;i <= b ; i++){
			if(c%i == 0){
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}