import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i = 1, temp;
		Scanner scan = new Scanner(System.in);
		
		while(true){
			temp = scan.nextInt();
			if(temp == 0){
				break;
			}
			System.out.printf("Case %d: %d\n", i, temp);
			i++;
		}
	}
}