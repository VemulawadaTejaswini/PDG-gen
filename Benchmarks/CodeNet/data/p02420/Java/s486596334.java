mport java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
	public static void main(String args[])throws IOException{	
		Scanner scan = new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
				
		int m, n, h;
		String str;
		
		while(true){
			str = br.readLine();
			if(str.equals("-"))break;
			
			n = str.length(); //??????????????°???????????°???
			
			m = scan.nextInt(); //?????£??????????????°
			
			for(int i = 0; i < m; i++){
				h = scan.nextInt(); //????????? h ????????????
				
				String sub = str.substring(0, h); //
				String sub2 = str.substring(h);
				str = sub2;
				str += sub;
			}
			
			System.out.println(str);
		}
	}
}