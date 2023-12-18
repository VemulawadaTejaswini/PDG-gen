import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//?????°???????????????
		int people = sc.nextInt();
		int max = 0;

		int[] wakasagi = new int[people+1];
		Arrays.fill(wakasagi, 0);

		for(int $ = 1; $ <= people; $++) {
			wakasagi[sc.nextInt()] = sc.nextInt();
			max = Math.max(max, wakasagi[$]);
		}

        for(int i = 1;i <= people; i++) {
            if(wakasagi[i] == max) {
                System.out.println(i + " " + max);
                break;
            }
        }
	}

}