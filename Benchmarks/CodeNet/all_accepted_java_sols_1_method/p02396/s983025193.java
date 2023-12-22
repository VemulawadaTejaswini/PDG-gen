import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int i=0,x;

		do{
			s= buf.readLine();
			x= Integer.parseInt(s);
			i=i+1;
		if(x!=0){
			System.out.println("Case "+i+": "+x);
		}
		else{}
		}while(x!=0);
	}
}