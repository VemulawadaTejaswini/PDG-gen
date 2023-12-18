import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int result = 1;
		boolean skipped = false;
		int i=1;
		for(; i<s.length(); i++){
			if( !skipped && s.charAt(i-1) == s.charAt(i) ){
				i++;
				skipped = true;
			}else
				skipped = false;
			
			result++;
		}
		if( i == s.length()+1 )
			result--;
		
		System.out.println(result);
	}
}
