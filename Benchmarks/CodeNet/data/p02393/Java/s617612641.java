import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		try {
			BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
			String line;
			while ((line = stdReader.readLine()) != null){
				String[] temp = line.split(" ");
				sortAndPut(temp);
			}
		} catch (Exception e) {
			e.getStackTrace();
			System.exit(0);
		}
	}

	private static void sortAndPut(String[] temp){
		int a = Integer.parseInt(temp[0]);
		int b = Integer.parseInt(temp[1]);
		int c = Integer.parseInt(temp[2]);
		if(b > c){
			int work = b;
			b = c;
			c = work;
		}
		if(a > b){
			int work = a;
			a = b;
			b = work;
		}
		if(b > c){
			int work = b;
			b = c;
			c = work;
		}
		System.out.println(a+" "+b+" "+c);
	}
}