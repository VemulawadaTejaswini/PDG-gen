import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int n = sc.nextInt();
		int x = sc.nextInt();

		while(n!=0||x!=0){
			for(int i = 1; i <= n-2; i++){
				for(int j = i+1; j < (double)(x-i)/2; j++){
					if(j>n-1||x-i-j>n) continue;
					count++;
				}
			}
			System.out.println(count);
			n = sc.nextInt();
			x = sc.nextInt();
			count = 0;
		}
	}
}