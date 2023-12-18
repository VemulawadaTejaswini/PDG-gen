import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int player[] = new int[5];
		int a[] = new int[2];
		int check[] = new int[4];
		int i, j, Min;
	
		while ((player[0] = input.nextInt()) != 0){
			j = 0;
			for (i = 0; i < 4; i++){
				check[i] = 1;
			}
			check[player[0]] = -1;
			for (i = 1; i < 5; i++){
				player[i] = input.nextInt();
				check[player[i]] = -1;
			}
			for (i = 1; i < 4; i++){
				check[0] *= check[i];
				if (check[i] == -1){
					a[j++] = i;
				}
			}
			if (check[0] == -1){
				for (i = 0; i < 5; i++){
					player[i] = 3;
				}
			}
			else if (check[3] == -1 && check[1] == -1){
				for (i = 0; i < 5; i++){
					if (player[i] == 3){
						player[i] = 1;
					}
					else {
						player[i] = 2;
					}
				}
			}
			else {
				if (a[0] > a[1]){
					Min = a[1];
				}
				else {
					Min = a[0];
				}
				for (i = 0; i < 5; i++){
					if (player[i] == Min){
						player[i] = 1;
					}
					else {
						player[i] = 2;
					}
				}
			}
			for (i = 0; i < 5; i++){
				System.out.println(player[i]);
			}
		}
	}
}