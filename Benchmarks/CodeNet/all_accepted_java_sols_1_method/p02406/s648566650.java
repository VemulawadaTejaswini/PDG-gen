import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		String line;
		int n;

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			line = reader.readLine();
			n = Integer.parseInt(line);

			for(int i=1;i<=n;i++){
				if(i%3==0){
					System.out.print(" "+i);
				}
				else if(String.valueOf(i).contains("3")){
					System.out.print(" "+i);
				}
			}
			System.out.println();
		} catch (NumberFormatException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}