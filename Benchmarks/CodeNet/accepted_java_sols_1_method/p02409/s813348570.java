import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] rooms = new int[121];
		scan.nextLine();
		
		for (int i=1; i<=n; i++) {
			int b = scan.nextInt();
			int f = scan.nextInt();
			int r = scan.nextInt();
			int v = scan.nextInt();
			
			rooms[((b-1)*30) + ((f-1)*10) +r] += v;
		}
		
		for(int i=1; i<=120; i++) {
			System.out.print(" " + rooms[i]);
			if(i%10 == 0) {
				System.out.println();
			}
			if(i%10 == 0 && i%3 == 0 && i < 120) {
				System.out.println("####################");
			}
		}
		
	}
}
