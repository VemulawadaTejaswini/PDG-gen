import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {

			int num = sc.nextInt();
			int prime_count = 0;

			int [] array = new int[num+1];

			/*エラトステネスの篩*/

			for(int i=2; i<=num; i++){
				array[i] = 0;
			}

			for(int i=2; i<=num; i++){
				if(array[i] == 1) ;
				else{
					for(int j=i+i; j<=num; j=j+i){
						array[j] = 1;
					}
				}
			}

			for(int i=2; i<=num; i++){
				if(array[i] == 0) prime_count++;
			}
			System.out.println(prime_count);
		}
	}
}