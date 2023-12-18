import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] a){
       		int[] intList = new int[10];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		do {
			int temp = sc.nextInt();
			if (temp <= 10000) {
				intList[count] = sc.nextInt();
				count++;
			}
		} while (count < 10);
		Arrays.sort(intList);
		for (int j = 0; j < 3; j++) {
			System.out.println(intList[j]);
		}
		sc.close();
 
    }
}