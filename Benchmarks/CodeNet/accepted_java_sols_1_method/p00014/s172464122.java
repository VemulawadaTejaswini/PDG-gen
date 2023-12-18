import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int D;		//??\?????????????´???°
		int x=0;	//X??§?¨?
		int val=0;	//??¢???
		
		while(str!=null){
			D=Integer.parseInt(str);
			while(600-D>=x){
				val+=D*x*x;
				x+=D;
			}
			System.out.println(val);
			x=0;
			val=0;
			str=br.readLine();
		}
	}

}