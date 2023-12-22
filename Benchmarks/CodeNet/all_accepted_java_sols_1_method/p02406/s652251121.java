import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int i = 1;

		do{
			int x = i;
			if(x % 3 == 0){
				System.out.print(" " + i);
			}else{
				do{
					if(x % 10 == 3){
						System.out.print(" " + i);
						break;
					}else{
						x /= 10;
					}
				}while(x != 0);
			}
		}while( ++i <= n);
		System.out.print("\n");

	}

}