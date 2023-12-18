import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int min = 1000000000;
		for(int i = 0; i < n; i++){
			int work = sc.nextInt();
			max = Math.max(max,work);
			min = Math.min(min,work);
		}
		System.out.print(max-min);
	}
}
