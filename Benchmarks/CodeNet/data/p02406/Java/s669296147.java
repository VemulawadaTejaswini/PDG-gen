import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n >= 3 && n <= 10000){
			for(int i = 1; i <= n; i++){

				if(i % 3 == 0){
					System.out.print(" " + i);
				}else{
					do{
						if(i % 10 == 3) {
							System.out.print(" " + i);
							break;
						}
						i /= 10;
					}while(i != 0);
				}

			}
		}
		System.out.println("");

	}

}