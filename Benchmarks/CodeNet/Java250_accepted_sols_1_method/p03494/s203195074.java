//第 4 問: ABC 087 B - Coinsi (200 点)

import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		scan.nextLine();

		int arr[] = new int[N];
		int flag = 1;
		int count = 0;

		for(int i=0; i<N; i++) {
			arr[i] = scan.nextInt();
		}

		while(flag==1) {

			for(int i=0; i<N; i++) {

				if(count==0 && arr[i]%2 == 1) {
					flag = 0;
					count= -1;
					break;
				}

				arr[i] = arr[i]/2;

				if(arr[i]%2 == 1) {
					flag = 0;
				}

			}

			++count;

		}

		System.out.println(count);

	}
}

