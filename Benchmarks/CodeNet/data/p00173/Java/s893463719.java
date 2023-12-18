import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str;
		int am, pm;
		
		for(int i = 0; i < 9; i++){
			str = scan.next();
			am = scan.nextInt();
			pm = scan.nextInt();
			
			System.out.println(str + " " + am + pm + " " + am * 200 + pm * 300);
		}