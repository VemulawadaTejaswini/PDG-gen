import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
        	BigInteger n1 = new BigInteger(br.readLine());
        	BigInteger n2 = new BigInteger(br.readLine());

        	String result = n1.add(n2).toString();
        	
        	if(result.length() <= 80){
        		System.out.println(result.toString());
        	}
        	else {
        		System.out.println("overflow");
        	}
        }

    }

}