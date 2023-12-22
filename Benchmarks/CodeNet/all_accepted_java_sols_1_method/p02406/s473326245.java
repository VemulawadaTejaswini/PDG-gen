
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;

		while(true){
			int x = i;
			if(x % 3 == 0){
				System.out.printf(" %d",i);
			}else{
				while(x != 0){
					if(x % 10 == 3){
						System.out.printf(" %d",i);
						break;
					}else{
						x = x / 10;
					}
				}
			}

			i++;
			if(i > n){
				break;
			}
		}
		System.out.print("\n");
	}
}