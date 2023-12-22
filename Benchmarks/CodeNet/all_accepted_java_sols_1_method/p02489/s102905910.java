import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int i = 1;
		for (;;){
			int x = s.nextInt();
			if (x == 0) break;
			System.out.println("Case " + i + ": " + x);
			i++;
		}
		
	}
}