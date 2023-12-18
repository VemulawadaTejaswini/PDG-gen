
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a[] = new int[n];

		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}

		int mode = 0;
		int count = 1;

		for(int i = 1; i < n; i++){
			if(mode == 0){
				if(a[i] > a[i - 1]){
					mode = 1;
				}
				else if(a[i] < a[i - 1]){
					mode = 2;
				}
			}
			else if(mode == 1 && a[i] < a[i - 1]){
				mode = 0;
				count++;
			}
			else if(mode == 2 && a[i] > a[i - 1]){
				mode = 0;
				count++;
			}
		}

		System.out.println(count);
	}
}
