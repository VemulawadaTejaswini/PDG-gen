import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		while((n = sc.nextInt()) != 0){
			int[] point = new int[100];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < 5; j++){
					point[i] += sc.nextInt();
				}
			}
			int max = point[0]; int min = point[0];
			for(int i = 0; i < n; i++){
				if(max < point[i]) max = point[i];
				if(min > point[i]) min = point[i];
			}
			System.out.println(max + " " + min);
		}
	}
}