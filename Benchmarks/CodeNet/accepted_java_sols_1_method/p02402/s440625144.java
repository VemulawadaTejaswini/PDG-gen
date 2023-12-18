import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String strA = sc.nextLine();
		int intA = Integer.parseInt(strA);
		int[] arrayInt =  new int[intA];
		int max = 0;
		int min = 0;
		long intSumCount = 0;

		for(int i = 0; i < intA; i++) {
			arrayInt[i] = sc.nextInt();
			intSumCount = intSumCount + arrayInt[i];
		}
		max = arrayInt[0];
		min = arrayInt[0];
		for(int j = 0; j < arrayInt.length; j++) {
			if(max < arrayInt[j]) {
				max = arrayInt[j];
			}
			if(arrayInt[j] < min) {
				min = arrayInt[j];
			}
		}
		System.out.printf("%d %d %d%n",min, max, intSumCount);
	//	System.out.println("?????§?????? : "+max);
	//	System.out.println("????°??????? : "+min);
	//	System.out.println("????¨??????? : "+ intSumCount);
	}
}