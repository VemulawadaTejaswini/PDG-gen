import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args){
    	InputStreamReader isr = new InputStreamReader(System.in);
    	BufferedReader br = new BufferedReader(isr);
    	try {
			String buf = br.readLine();
			int num = Integer.parseInt(buf);
			System.out.println(num * num * num);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}