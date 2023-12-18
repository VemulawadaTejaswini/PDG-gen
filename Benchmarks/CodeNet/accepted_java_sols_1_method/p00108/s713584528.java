import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n;
		int i, j;
		int count, ct, k = 0;
		int num[][] = new int[2][15];
		
		while ((n = input.nextInt()) != 0){
			count = 0;
			for (i = 0; i < n; i++){
				num[0][i] = input.nextInt();
			}
			k = 0;
			while (true){
				for (i = 0; i < n; i++){
					ct = 0;
					for (j = 0; j < n; j++){
						if (num[k][i] == num[k][j]) ct++;
					}
					num[1 - k][i] = ct;
				}
				ct = 0;
				for (i = 0; i < n; i++){
					if (num[0][i] == num[1][i]) ct++;
				}
				if (ct == n){
					break;
				}
				k = 1 - k;
				count++;
			}
			
			System.out.print(count + "\n" + num[0][0]);
			for (i = 1; i < n; i++){
				System.out.print(" " + num[0][i]);
			}
			System.out.println();
		}
	}
}