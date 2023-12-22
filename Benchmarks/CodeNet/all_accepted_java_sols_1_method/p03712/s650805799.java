import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		
		int H = scan.nextInt();
		int W = scan.nextInt();
		
		
		//char[][] moji = new char[H][W];
		
		String[] moji = new String[H];
		
		
		
		
		
		for(int i = 0;i<H;i++){
				moji[i] = scan.next();
		}
		
		
		String[] kakudaimoji = new String[H+2];
		
		kakudaimoji[0] = "";
		kakudaimoji[H+1] = "";
		
		
		
		for(int i = 0;i<W+2;i++){
			
			kakudaimoji[0] +="#";
			kakudaimoji[H+1] +="#";
			
		}
		
		
		for(int i = 1;i<H+1;i++){
			kakudaimoji[i] = "#"+moji[i-1]+"#";
		}
		
		
		
		for(int i = 0;i<H+2;i++){
			System.out.println(kakudaimoji[i]);
		}
		
		
		
		
		
		
		
		
	}

}
