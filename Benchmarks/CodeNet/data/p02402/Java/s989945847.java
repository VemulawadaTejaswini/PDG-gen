import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ai[] = new int[5];
		int min,max;
		long sum = 0;

		for(int i = 0;i < n;i++){
			ai[i] = sc.nextInt();
			sum += ai[i];
		}
		max = ai[0];
		min = ai[0];
		for(int i = 1;i < n;i++){
			if(ai[i] > max){
				max = ai[i];
			}
			if(ai[i] < min){
				min = ai[i];
			}
		}
			System.out.println(min + " " + max + " " + sum);
		    sc.close();
	}
}