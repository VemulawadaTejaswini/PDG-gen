import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		String str;
		int e, m, hoge;
		while(!(str = reader.readLine()).equals("0")){
			e = Integer.valueOf(str);
			m = Integer.MAX_VALUE;
			for(int i = 0; Math.pow(i, 3) <= e; i++){
				hoge = (int)Math.sqrt(e - Math.pow(i, 3));
				m = (int)Math.min(e - Math.pow(i, 3) - Math.pow(hoge, 2) + hoge + i, m);
			}
			System.out.println(m);
		}
		reader.close();
	}
}