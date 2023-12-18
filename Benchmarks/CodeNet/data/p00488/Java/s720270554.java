import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int[] price = new int[5];
		for(int i = 0; i < 5; i++) {
			price[i] = sc.nextInt();
		}
		int p_min = price[0], j_min = price[3];
		for(int i = 1; i < 3; i++) {
			if(p_min > price[i]) {
				p_min = price[i];
			}
		}
		if(j_min > price[4]) {
			j_min = price[4];
		}
		int min;
		min = p_min + j_min - 50;
		System.out.println(min);
	}

}