import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b;
		boolean exist;

		for(int i = 0;;i++){
			a = sc.nextInt();
			b = sc.nextInt();
			if(a == 0 && b == 0) break;
			exist = false;

			if(i != 0) System.out.println();
			for(int j = a; j <= b; j++){
				if((j % 4 == 0 && j % 100 != 0) || j % 400 == 0){
					System.out.println(j);
					exist = true;
				}
			}

			if(exist == false) System.out.println("NA");
		}
	}
}