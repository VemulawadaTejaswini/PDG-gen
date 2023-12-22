import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(input.readLine());
		int i = 0 , taroPo = 0 , hanakoPo = 0 ;
		while(i != n){
			i++;
			String str = input.readLine();
			String taro = str.substring(0,str.indexOf(' '));
			String hanako = str.substring(str.indexOf(' ') +1);
			
			if(taro.compareTo(hanako) < 0) hanakoPo += 3;
			else if(taro.compareTo(hanako) > 0) taroPo += 3;
			else { 
				taroPo ++;
				hanakoPo ++;
			}
		}
		
		System.out.println(taroPo + " " + hanakoPo);
		
	}

}