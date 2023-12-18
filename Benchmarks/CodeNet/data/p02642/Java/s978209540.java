
import java.util.Arrays;
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

		Arrays.sort(a);

		boolean[] valid = new boolean[n];
		Arrays.fill(valid, true);



		for(int i = 0; i < n; i++){
			if(!valid[i]){
				continue;
			}
			for(int j = i + 1; j < n; j++){
				if(a[j] % a[i] == 0){
					valid[j] = false;
				}
			}
		}

		if(n >= 2 && a[0] == a[1]){
			valid[0] = false;
		}

		int count = 0;
		for(int i = 0; i < n; i++){
			if(valid[i]){
				count++;
			}
		}

		System.out.println(count);
	}
}
