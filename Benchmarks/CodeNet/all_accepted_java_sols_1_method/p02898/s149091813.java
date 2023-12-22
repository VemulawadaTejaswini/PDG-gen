import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int people = scan.nextInt();
		int height = scan.nextInt();
		int i;
		int count = 0;
			
		for(i = 0 ; i < people ; i++) {
			String jet_height = scan.next();
			int jet_height_num = (int) Integer.parseInt(jet_height);
	
			if(jet_height_num >= height) {
				count++;
			}
		}
		scan.close();
		System.out.println(count);
	}
}
