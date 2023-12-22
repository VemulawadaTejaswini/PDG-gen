import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int[]count = new int[9];
		int min = 0;
		int max = 0;
		int tmp = 0;
		for(int i = 0; i < n; i++) {
			tmp = sc.nextInt();
			if(tmp <= 399) 	count[0] = 1;
			else if(tmp <= 799) 	count[1] = 1;
			else if(tmp <= 1199) 	count[2] = 1;
			else if(tmp <= 1599) 	count[3] = 1;
			else if(tmp <= 1999) 	count[4] = 1;
			else if(tmp <= 2399) 	count[5] = 1;
			else if(tmp <= 2799) 	count[6] = 1;
			else if(tmp <= 3199) 	count[7] = 1;
			else count[8]++;
		}

		for(int i = 0; i < 8; i++)	min += count[i];
		if(min == 0) min =1;
		for(int i = 0; i < 9; i++)	max += count[i];

		System.out.println(min + " " + max);

	}
}