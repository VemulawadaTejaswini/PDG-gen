import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] sortedArr = new int[n];

		for (int i = 0; i < n; i++) {
			sortedArr[i] = s.nextInt();
		}

		int[]originArr=sortedArr.clone();
		Arrays.sort(sortedArr);

		int firstNum=sortedArr[(n/2)-1];
		int secondNum=sortedArr[n/2];

		for(int j=0;j<n;j++){
			if(originArr[j]<secondNum){
				System.out.println(secondNum);
			}
			else{
				System.out.println(firstNum);
			}
		}

	}
}
