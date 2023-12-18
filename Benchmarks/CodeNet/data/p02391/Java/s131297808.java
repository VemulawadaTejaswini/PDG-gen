import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		try {
			BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
			String line;
			while ((line = stdReader.readLine()) != null){
				String[] temp = line.split(" ");
				int a = Integer.parseInt(temp[0]);
				int b = Integer.parseInt(temp[0]);
				if(a < b){
					System.out.println(a+" < "+b);
				}else if (a > b){
					System.out.println(a+" > "+b);
				} else {
					System.out.println(a+" == "+b);
				}
			}
		} catch (Exception e) {
			e.getStackTrace();
			System.exit(0);
		}
	}
}