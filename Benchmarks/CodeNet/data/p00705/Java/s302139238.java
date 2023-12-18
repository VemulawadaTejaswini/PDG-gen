import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String str, s[];
		
		int n, q, date[];
		x : while(!(str = reader.readLine()).equals("0 0")){
			s = str.split(" ");
			n = Integer.valueOf(s[0]);
			q = Integer.valueOf(s[1]);
			
			date = new int[99];
			for(int i = 0; i < n; i++){
				s = reader.readLine().split(" ");
				for(int j = 1; j <= Integer.valueOf(s[0]); j++){
					date[Integer.valueOf(s[j])]++;
				}
			}
			for(int i = n; i >= q; i--)
				for(int j = 1; j < date.length; j++){
					if(date[j] == i){
						System.out.println(j);
						continue x;
					}
				}
			System.out.println(0);
		}
		reader.close();
	}
}