import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
	public static void main(String[] args)throws IOException{
		int time,h,m,s;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		time=Integer.parseInt(br.readLine());
		h=time/3600;
		m=(time%3600)/60;
		s=time-h*3600-m*60;
		System.out.println(h+":"+m+":"+s);
	}
}