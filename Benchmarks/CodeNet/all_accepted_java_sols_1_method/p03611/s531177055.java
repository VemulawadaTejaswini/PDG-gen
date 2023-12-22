import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] count = new int[100000];
		for(int i=0;i<n;i++) {
			count[in.nextInt()]++;
		}
		int max = -1;
		for(int i=2;i<100000;i++) {
			int num = count[i-2]+count[i-1]+count[i];
			if(num>max) max = num;
		}
		System.out.println(max);
		in.close();
	}

}
