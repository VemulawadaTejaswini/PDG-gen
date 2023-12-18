import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //コンソールから入れる際に高速に入れる方法
		String x = br.readLine();
      	if(x.contains("A") && x.contains("B")) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
    }
}