import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] ss = br.readLine().split(" ");
			for(int i=0; i<ss.length; i++) {
				if(ss[i].equals("0")) {
					System.out.print(i+1);
				}
			}
		} catch(Exception e) {}
	}
}