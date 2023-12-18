import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		try {
			BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
			String line;
			while ((line = stdReader.readLine()) != null){
				String[] temp = line.split(" ");
				put(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
			}
		} catch (Exception e) {
			e.getStackTrace();
			System.exit(0);
		}
	}

	private static void put(int a, int b){
		if(a < b){
			System.out.println("a < b");
		}else if (a > b){
			System.out.println("a > b");
		} else {
			System.out.println("a == b");
		}
	}
}