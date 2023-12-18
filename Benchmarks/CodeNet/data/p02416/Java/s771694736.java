import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		
		Scanner scan = new Scanner(System.in);

		while(true){
			int x = scan.nextInt();
			if(x == 0) break;
			String X = String.valueOf(x);
			
			int sl = X.length();
			int total = 0;
			for(int i=0; i<sl; i++){
				String s = X.substring(i, i+1);
				int t = Integer.parseInt(s);
				total = total + t;
			}
			System.out.println(total);
		}
	
	}

}