
	import java.util.Scanner;
	public class Main{
		public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int a = scan.nextInt();
		String str = scan.next();
		if(str.length()<=a) {
			System.out.print(str);
		}
		else{
			for(int i=1;i<a;i++) {
				str.substring(i);
				System.out.print(str);
			}
			System.out.print("...");
		}
	
	
		 }

		
}
		
		
	