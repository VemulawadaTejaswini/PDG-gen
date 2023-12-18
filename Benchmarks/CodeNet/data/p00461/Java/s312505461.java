import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		Main byakko = new Main();
		String source = "IOI";
		int n, m, count;
		
		n = Integer.parseInt(reader.readLine());
		m = Integer.parseInt(reader.readLine());
		
		source = byakko.IOIOI(source, n);
		count = byakko.IOIcount(reader.readLine(), source, n, m);
		
		System.out.println(count);
		
		reader.close();
	}
	
	public String IOIOI(String source, int n){
		for(int i = 1; i < n; i++) source += "OI";
		return source;
	}
	
	public int IOIcount(String source, String IOI, int n, int m){
		int count = 0;
		for(int i = 0; i < m - (1 + n * 2); i++)
			if(source.substring(i, i + (1 + n * 2)).equals(IOI)) count++;
		return count;
	}
	
}