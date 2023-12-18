
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int i = 0;
            int w = sc.nextInt();
            int n = sc.nextInt();
            String rem;
            int[] array;
            array = new int[w];

            for (i = 0; i < w; i++) {
                array[i] = i + 1;
            }

            for (i = 0; i < n; i++) {
                rem = sc.next();
                String[] swap = rem.split(",");
                int a = Integer.parseInt(swap[0]) - 1;
                int b = Integer.parseInt(swap[1]) - 1;
                int temp = 0;
                temp = array[a];
                array[a] = array[b];
                array[b] = temp;
            }
            for (i = 0; i < w; i++) {
                System.out.println(array[i]);
            }
        }
    }
}

