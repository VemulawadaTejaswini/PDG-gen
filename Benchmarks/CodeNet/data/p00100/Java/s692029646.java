import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int kShain;
		int dataNumber;
		int dataCost;
		int dataKosu;
		boolean flag;
		
		kShain = sc.nextInt();
		while (kShain != 0) {
			flag = true;
			for (int i = 0; i < kShain; i++) {
				dataNumber = sc.nextInt();
				dataCost = sc.nextInt();
				dataKosu = sc.nextInt();
				if (1000000 <= dataCost * dataKosu) {
					System.out.println(dataNumber);
					flag = false;
				}
			}
			
			if (flag == true) {
				System.out.println("NA");
			}
			
			kShain = sc.nextInt();
		}
	}
}