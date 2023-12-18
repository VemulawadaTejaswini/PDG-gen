import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int indices = sc.nextInt();
		int[][] relations = new int[indices][indices];
		
		for(int i = 0; i < indices; i++) {
			int index = sc.nextInt();
			int degree = sc.nextInt();
			
			for(int j = 0; j < degree; j++) {
				int currentValue = sc.nextInt();
				relations[index-1][currentValue-1] = 1;
			}
		}
		
		for(int i = 0; i < indices; i++) {
			for(int j = 0; j < indices; j++) {
				if(j == indices-1) {
					System.out.print(relations[i][j] + "\n");
				}else if(i == indices-1 && j == indices-1){
					System.out.print(relations[i][j]);
				}else {
					System.out.print(relations[i][j] + " ");
				}
			}
		}
	}
}

