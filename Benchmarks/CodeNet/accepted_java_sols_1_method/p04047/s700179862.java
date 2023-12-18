import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] kushi = new int[2*num];
		for(int i=0; i<2*num; i++){
			kushi[i] = sc.nextInt();
		}

		Arrays.sort(kushi);

		int sum=0;
		for(int i=0; i<2*num; i+=2){
			sum += kushi[i];
		}

		System.out.println(sum);
	}
}