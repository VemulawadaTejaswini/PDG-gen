import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean flows = true;
		Scanner sc = new Scanner(System.in);

		int countcase = 0;

		while(true) {
			int getNum = sc.nextInt();
			if(getNum==0) {
				sc.close();
				break;
			}else {
				countcase++;
				System.out.println("Case " + countcase + ":" + getNum);

			}

		}


	}

}

