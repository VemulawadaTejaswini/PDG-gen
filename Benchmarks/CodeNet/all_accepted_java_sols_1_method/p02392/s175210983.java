import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		int[] array = new int[3];
		String judge;

		for(int i=0;i<3;i++) {
			array[i] = sc.nextInt();
		}

		if(array[0] < array[1] && array[1] < array[2]) {
			judge = "Yes";
		}else {
			judge = "No";
		}

		System.out.println(judge);

		sc.close();
	}
}
