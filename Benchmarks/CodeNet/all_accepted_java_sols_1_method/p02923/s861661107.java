import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split(" ");
		int prev = Integer.parseInt(line[0]);
		int now;
		int result = 0;
		int count = 0;
		for(int i=1; i<n; i++){
			now = Integer.parseInt(line[i]);
			if( prev >= now )
				count++;
			else{
				if( result < count )
					result = count;
				count = 0;
			}
			prev = now;
		}
		if( result < count )
			result = count;
		System.out.println(result);
	}
}
