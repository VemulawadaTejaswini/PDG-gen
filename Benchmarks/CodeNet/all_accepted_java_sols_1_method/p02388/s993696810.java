import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) {
		
		int x;

		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String str=null;
		
		try{
			str=br.readLine();
			br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		x=Integer.parseInt(str);
		System.out.println(x*x*x);
	}

}

