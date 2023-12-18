import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a[] = new int[n];

		for (int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}

		int index = 0;
		int money = 1000;

		while (index <= n){

			int motone = a[index];
			int urine = 0;

			for (int i=index+1; i<n; i++){
				urine = Math.max(urine, a[i]);
				if (i < n-1 && a[i] > a[i+1]){
					index = i+1;
					break;
				}
				index = i;
			}

			if (motone < urine){
				int kabu = money / motone;
				money = money % motone;
				money += kabu * urine;
			}

			if (index >= n-1){
				break;
			}
		}
		System.out.println(money);
	}


}