import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dishes[] = new int[5];

		for(int i = 0; i < 5; i++) {
			 dishes[i] = Integer.parseInt(sc.nextLine());
		}

		int diffmax = 0;
		int diffmaxindex = 0;
		int diff = 0;
		for(int i = 0; i < 5; i++) {
			if(dishes[i]%10 != 0) {
				diff = (dishes[i]/10 + 1) * 10 - dishes[i];
			}

			if(diffmax < diff) {
				diffmax = diff;
				diffmaxindex = i;
			}
		}

		int sumTime = 0;

		for(int i = 0; i < 5; i++) {
			if(i != diffmaxindex) {
				if(dishes[i]%10 != 0) {
					sumTime = sumTime + ((dishes[i]/10 + 1) * 10);
				}else {
					sumTime = sumTime + dishes[i];
				}

			}
		}

		sumTime = sumTime + dishes[diffmaxindex];

		System.out.println(sumTime);
	}

}