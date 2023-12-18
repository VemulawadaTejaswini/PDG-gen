import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		//Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s="";
		while((s=br.readLine())!=null){
			StringTokenizer st=new StringTokenizer(s," +-*/?");
			if(s.contains("+")){
				System.out.println(new BigInteger(st.nextToken()).add(new BigInteger(st.nextToken())));
			}else if(s.contains("-")){
				System.out.println(new BigInteger(st.nextToken()).subtract(new BigInteger(st.nextToken())));
			}else if(s.contains("*")){
				System.out.println(new BigInteger(st.nextToken()).multiply(new BigInteger(st.nextToken())));
			}else if(s.contains("/")){
				System.out.println(new BigInteger(st.nextToken()).divide(new BigInteger(st.nextToken())));
			}else{
				break;
			}
		}
		
	}

}