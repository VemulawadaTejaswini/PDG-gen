import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int sum = 0;
		int counter = 0;
		for(int i = 1; i <= n; i++){
			for(int j = i+1; j <= n; j++){
				for(int k = j+1; k <= n; k++){
					sum = i + j + k;
					if(sum == x && i != j && j != k && k != i){
						counter++;
					}
				}
			}
		}
		System.out.println(counter);
	}
}