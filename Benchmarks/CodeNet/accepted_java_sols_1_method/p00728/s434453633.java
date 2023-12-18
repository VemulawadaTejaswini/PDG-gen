import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		int s[];
		int result;
		int max_i;
		int min_i;

		while (true){
			n = sc.nextInt();
			if (n == 0){
				break;
			}

			s = new int[n];
			result = 0;
			max_i = 0;
			min_i = 0;

			for (int i = 0; i < n; i++){
				s[i] = sc.nextInt();

				if (s[i] > s[max_i]){
					max_i = i;
				}else if (s[i] < s[min_i]){
					min_i = i;
				}
			}

			for (int i = 0; i < n; i++){
				if (i != max_i && i != min_i){
					result += s[i];
				}
			}

			System.out.println("" + (result / (n - 2)));
		}

	}
}