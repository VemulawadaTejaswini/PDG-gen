import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
public class Main{
    public static void main(String[] arg)throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String strARY[] = str.split(" ");
		int a = Integer.parseInt(strARY[0]);
		int b = Integer.parseInt(strARY[1]);
		
		double m = 3.305785;
		
		System.out.println((double)a*b/m);
    }
}