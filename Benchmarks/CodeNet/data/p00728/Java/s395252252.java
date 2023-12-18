import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true){
			int sousuu = sc.nextInt(), sum = 0;
			if(0==sousuu) break;
			int[] ten = new int[sousuu];
			double ave = 0.0;
			for(int i=0;i<sousuu;i++) ten[i] = sc.nextInt();
			Arrays.sort(ten);
			for(int i=1;i<sousuu-1;i++) sum += ten[i];
			System.out.println(sum/(sousuu-2));
		}
	}
}
