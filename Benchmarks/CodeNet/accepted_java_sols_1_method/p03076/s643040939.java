import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int[] array = new int[5];
		int[] count = new int[5];
		int max = 0;

		for(int i=0;i<5;i++) {
			array[i] = scan.nextInt();
		}

		boolean flg = true;
		for(int i=0;i<5;i++) {
		while(true) {
			if(array[i] % 10 == 0) {
				sum += array[i];
				flg = false;
				break;
			 }else {
				array[i]++;
				count[i]++;
			 }
			}
		}

		for(int i=0;i<5;i++) {
			max = Math.max(max, count[i]);
		}

		System.out.println(sum-max);
		scan.close();
	}

}
