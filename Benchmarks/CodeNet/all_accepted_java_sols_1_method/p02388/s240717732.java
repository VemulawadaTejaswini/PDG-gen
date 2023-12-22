import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
		
		public static void main(String[] args) throws IOException {
//			java.util.Scanner scan = new java.util.Scanner(System.in);
//		int x = scan.nextInt();
			
			BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
			String str = br.readLine();
			int x = Integer.parseInt(str);
			
		if(1<=x && x<=100){;
		System.out.println(x*x*x);// TODO ?????????????????????????????????????????????
		}
		}	
			
		
	
	}
	