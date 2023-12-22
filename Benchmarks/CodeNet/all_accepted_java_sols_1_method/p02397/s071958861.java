import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String strArray[] = str.split(" ");

		int a = Integer.parseInt(strArray[0]);
		int b = Integer.parseInt(strArray[1]);
		for(int i = 0; i<3000; i++){
			if(a==0 && b==0){
				break;
			}else{
		if(a<b){
			System.out.println(a + " " + b);
		}else{
			System.out.println(b + " " + a);
		}
		strArray[0] = null;
		strArray[1] = null;
		str = br.readLine();
		strArray = str.split(" ");
		 a = Integer.parseInt(strArray[0]);
		b = Integer.parseInt(strArray[1]);
			}
		}
	}
}