import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] bounds = new int[n];
		int count = 1;
		for(int i = 0; i < n; i++){
			bounds[i] = sc.nextInt();
			if(i > 0){
				bounds[i] += bounds[i - 1];
			}
			if(bounds[i] <= x){
				count++;
			}
		}
		System.out.println(count);
	}
}
