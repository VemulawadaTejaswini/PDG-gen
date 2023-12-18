import java.util.Arrays;
import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[5];

		for(int i = 0; i < 5; i++){
			n[i]= sc.nextInt();
		}
		Arrays.sort(n);
		System.out.println(n[4]+""+n[3]+""+n[2]+""+n[1]+""+n[0]);
	}
}