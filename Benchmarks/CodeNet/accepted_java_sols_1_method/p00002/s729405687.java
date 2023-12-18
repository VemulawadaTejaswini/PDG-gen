import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	//0002
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			String str = br.readLine();
			while(true){
				if(str == null){
					break;
				}
				String[] st = str.split(" ",0);
				int a =  Integer.parseInt(st[0]);
				int b = Integer.parseInt(st[1]);
				int sum = a+b;
				System.out.println(String.valueOf(sum).length());
				str = br.readLine();
			}
		}catch(Exception ex){
			System.exit(0);
		}
	}
}