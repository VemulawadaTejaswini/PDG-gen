import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			int n = Integer.parseInt(br.readLine());
			String[] strArray = br.readLine().split("\\s");
			
			for (int i = n - 1; 0 < i + 1; i--) {
				System.out.print(strArray[i]);
				if(i == 0){
					System.out.println();
				}else{
					System.out.print(" ");
				}	
			}
			
			br.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}