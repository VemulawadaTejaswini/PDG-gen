import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int sum = 0, max = 0, min = 1000;
			for(i = 0; i < n; i++){
				int s = sc.nextInt();
				if(max < s) max = s;
				if(min > s) min = s;
				sum += s;
			}
			System.out.println((sum - max - min) / (n - 2));
		}
	}
}