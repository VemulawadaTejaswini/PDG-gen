import java.util.Scanner;

class Main {
	public static void main(String[] a){
		Scanner scan = new Scanner(System.in);
		
		int h, m, s;
		int startH, startM, startS;
		int endH, endM, endS;
		for(int i = 0; i < 3; i++){
			startH = scan.nextInt();
			startM = scan.nextInt();
			startS = scan.nextInt();
			endH = scan.nextInt();
			endM = scan.nextInt();
			endS = scan.nextInt();
			
			if(startS > endS){
				endS += 60;
				endM--;
			}s = endS - startS;
			
			if(startM > endM){
				endM += 60;
				endH--;
			}m = endM - startM;
			
			h = endH - startH;
			
			System.out.println(h + " " + m + " " + s);
		}
	}
}