import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] x = new int[]
		{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
		
		for(int i = 0; i < 28; i++)
			x[sc.nextInt() - 1] = 0;
		
		Arrays.sort(x);
		
		System.out.println(x[28]);
		System.out.println(x[29]);
	}
}