import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		try {
			BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
			String line;
			String[] tmp;
			while ((line = stdReader.readLine()) != null){
				tmp = line.split(" ");
				int a = Integer.parseInt(tmp[0]);
				int b = Integer.parseInt(tmp[1]);
				System.out.println((a*b)+" "+(a*2+b*2));
			}
		} catch (Exception e) {
			e.getStackTrace();
			System.exit(0);
		}
	}
}