import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.parseInt(str);
        int h, m, s;
        if(n>=0 && n<86400){
        	h = n/3600;
        	int rim = n % 3600;
        	m= rim/60;
        	s =rim%60;
        	System.out.println(h +":" + m + ":" + s);
        }
	}
}