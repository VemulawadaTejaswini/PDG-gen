import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] array = new int[6];
		for(int i = 0;i < 6;i++) {
			array[i] = sc.nextInt();
		}
		int dif = array[4] - array[0];
		if(dif <= array[5]) {
			System.out.println("Yay!");
		}else {
			System.out.println(":(");
		}
	}

}
