import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		
		Scanner sc = new Scanner(System.in);
		int intX = -1;
		int intY = -1;

		for(int i = 0; i < 3000; i++){


			intX = sc.nextInt();
			intY = sc.nextInt();

			if((intX == 0) && (intY == 0)){
				break;
			}

			int[] arr = new int[]{intX,intY};
			Arrays.sort(arr);

			System.out.println(arr[0] + " " + arr[1]);

		}
	}
}