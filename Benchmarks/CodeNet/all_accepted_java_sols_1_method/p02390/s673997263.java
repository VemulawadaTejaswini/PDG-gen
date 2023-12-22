import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int a ,b,c;
		String str = br.readLine();
		String strARY[] = str.split(" ");
		a= Integer.parseInt(strARY[0]);
		b = (a-a/3600*3600);
		c = (b-b/60*60);
		System.out.println(a/3600+":"+b/60+":"+ c);
	}		
}