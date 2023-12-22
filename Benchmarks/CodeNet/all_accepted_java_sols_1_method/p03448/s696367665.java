import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int sum = 0;
		int count = 0;

		for(int i = 0; i <= a; i++){
			for(int t = 0; t <= b; t++){
				for(int s = 0; s <= c; s++){
					sum = 500*i + 100*t + 50*s;
					if(sum == x){
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
