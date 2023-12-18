import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt();
			int [] array = new int [n];
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int x = sc.nextInt();
			int kazu = 0;
			for(int i = 0; i < n; i++){
				array[i] = sc.nextInt();
			}
			if(n + a + b + c + x == 0){
				break;
			}
			for(int i = 0; i <= 10000; i++){
				if(array[kazu] == x){
					kazu++;
				}
				x = (a * x + b) % c;
				if(kazu == n){
					System.out.println(i);
					break;
				}
				if(i == 10000){
					System.out.println(-1);
				}
			}
		}
	}
}