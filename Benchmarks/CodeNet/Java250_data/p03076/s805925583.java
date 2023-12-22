import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        int time[] = new int[5];
        for (int i = 0; i < 5; i++) {
            time[i] = sc.nextInt();
        }

        int index = 0;
        int min = 9;

        for (int i = 0; i < 5; i++) {
            if (time[i] % 10 != 0) {
                if (min > time[i] % 10) {
                    min = time[i] % 10;
                    index = i;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            if (i != index) {
                if (time[i] % 10 != 0) {
                    time[i] = time[i] - (time[i] % 10) + 10;
                }
            }
        }

        int result = 0;

        for (int i = 0; i < 5; i++) {
            result = result + time[i];
        }

        System.out.println(result);
	}
}
