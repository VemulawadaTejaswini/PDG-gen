import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int n;
		double money = 100000;

		str=br.readLine();
		n=Integer.parseInt(str);
		
		while(n>0){
			money = money*1.05;
			money = (Math.ceil(money/1000))*1000;
			n--;
		}
		System.out.println((int)money);
	}

}