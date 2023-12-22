import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int[] a = new int[5];
		int[] aa = new int[5];

		int i,j,temp;
		for(i = 0; i < 5; i++)
			a[i] = scan.nextInt();

		for(i = 0; i < 5; i++) {
			temp = a[i] / 10;
			if(a[i] % 10 != 0)
				temp++;
			temp *= 10;

			aa[i] = temp;
		}

		int min = Integer.MAX_VALUE;

		for(i = 0; i < 5; i++) {
			temp = 0;
			for(j = 0; j < 5; j++) {
				if(j == i) {
					temp += a[j];
				}else {
					temp += aa[j];
				}
			}
			min = Math.min(min, temp);
		}

		System.out.println(min);
	}
}
