import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[][] array = new String[h][];
        int sum = 0;
        for (int i = 0; i < h; i++) {
            array[i] = sc.next().split("");
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].equals("#")) {
                    sum++;
                }
            }
        }

        System.out.println(sum == h + w - 1 ? "Possible" : "Impossible");
    }
}