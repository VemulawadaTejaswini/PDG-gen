import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i = 0, temp;
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextInt()){
			temp = scan.nextInt();
			if(temp == 0){
				return;
			}
			System.out.printf("Case %d: %d\n", i, temp);
			i++;
		}
	}
}