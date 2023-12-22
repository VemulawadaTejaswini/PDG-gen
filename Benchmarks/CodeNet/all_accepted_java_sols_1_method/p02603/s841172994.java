import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long a[] = new long[n];

		for (int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}

		int index = 0;
		long money = 1000;

		while (index < n){

			long motone = a[index];
			long urine = 0;

			for (int i=index+1; i<n; i++){
				motone = Math.min(motone, a[i]);
				urine = Math.max(urine, a[i]);
				index = i;
				if (i < n-1 && a[i] > a[i+1]){
					break;
				}
			}

			if (motone < urine){
				long kabu = money / motone;
				money = money % motone;
				money += kabu * urine;
			}

			index++;
		}
		System.out.println(money);
	}


}