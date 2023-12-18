import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while((line = br.readLine()) != null){
			String[] s = line.split(" ");
			long a,b;
			a = Long.parseLong(s[0]);
			b = Long.parseLong(s[1]);
			System.out.println(gcd(a,b) + " " + lcm(a,b));
		}
	}
	
	public static long gcd(long a,long b){
		if(a%b == 0){ return b;}
		else{ return gcd(b,a%b);}
	}
	
	public static long lcm(long a,long b){
		return a*b / gcd(a,b);
	}
}