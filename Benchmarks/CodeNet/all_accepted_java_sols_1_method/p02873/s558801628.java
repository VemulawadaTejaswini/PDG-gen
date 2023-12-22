

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] input = sc.next().toCharArray();

		int n = input.length + 1;
		int a[] = new int[n];

		for(int i = 1; i < n; i++){
			if(input[i - 1] == '<'){
				a[i] = a[i - 1] + 1;
			}
			else {
				a[i] = 0;
			}
		}

		for(int i = n - 2; i >= 0; i--){
			if(input[i] == '>'){
				a[i] = Math.max(a[i], a[i + 1] + 1);
			}
		}

		long sum = 0;
		for(int i = 0; i < n; i++){
//			System.out.println(a[i]);
			sum += a[i];
		}

		System.out.println(sum);
	}

}
