import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int sub;
		int sum;
		int all;

		while(s.hasNext()){
			sub = s.nextInt();
			all = 0;
			if(sub == 0)
				break;
			int[][] table = new int[sub][sub];
			for(int i = 0; i < sub; i++){
				sum = 0;
				for(int j = 0; j < sub; j++){
					table[i][j] = s.nextInt();
					sum += table[i][j];
					System.out.print(table[i][j] + " ");
					if(j == sub - 1){
						System.out.println(sum);
					}
				}
			}

			for(int j = 0; j < sub; j++){
				sum = 0;
				for(int i = 0; i < sub; i++){
					sum += table[i][j];
				}
				all += sum;
				System.out.print(sum + " ");
			}
			System.out.println(all);
		}
		s.close();
	}

}