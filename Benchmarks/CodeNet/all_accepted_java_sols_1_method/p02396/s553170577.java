import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws Exception {
try {
	BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	int x = Integer.parseInt(buf.readLine());
	int count = 1;
	
	while(x != 0){
		System.out.println("Case " + count + ": " + x);
		x = Integer.parseInt(buf.readLine());
		count ++;
	}
} catch (Exception e) {
	// TODO: handle exception
}
		 }
    }