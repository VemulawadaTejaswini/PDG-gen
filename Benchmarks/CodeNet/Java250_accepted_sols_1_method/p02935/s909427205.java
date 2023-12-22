import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] values = new int[num];
		for(int i = 0; i < num; i++)values[i] = sc.nextInt();
		Arrays.sort(values);
		double ans = (double)values[0];
		for(int value : values){
			ans = (value + ans) / 2;
		}

		System.out.println(ans);
	}
}


