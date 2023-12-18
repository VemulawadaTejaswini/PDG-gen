import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args)throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int a ,b,c;
		String str = br.readLine();
		String strARY[] = str.split(" ");
		a= Integer.parseInt(strARY[0]);
		b = Integer.parseInt(strARY[1]);
		c = Integer.parseInt(strARY[2]);
		
		if(a < b && b < c){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}