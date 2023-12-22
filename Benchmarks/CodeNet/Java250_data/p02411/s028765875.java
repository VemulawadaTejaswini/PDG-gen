import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int tyukan = sc.nextInt();
			int kimatu = sc.nextInt();
			int saisi = sc.nextInt();
			String result = "";
			if(tyukan == -1 && kimatu == -1 && saisi == -1) {
				break;
			} else if (tyukan == -1 || kimatu == -1){
				result = "F";
			} else {
				if(tyukan + kimatu >= 80) {
					result = "A";
				} else if(tyukan + kimatu >= 65) {
					result = "B";
				} else if((tyukan + kimatu >= 50) || (tyukan + kimatu >= 30 && saisi >= 50)) {
					result = "C";
				} else if(tyukan + kimatu >= 30) {
					result = "D";
				} else {
					result = "F";
				}

			}

			System.out.println(result);
		}


	}
}