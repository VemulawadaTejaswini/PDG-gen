import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String str;
		String min;
		
		min = scan.next();
		
		for (int i = 1; i < n; i++){
			str = scan.next();
			
			if (str.compareTo(min) < 0){
				min = str;
			}
		}
		
		System.out.println(min);
	}
}