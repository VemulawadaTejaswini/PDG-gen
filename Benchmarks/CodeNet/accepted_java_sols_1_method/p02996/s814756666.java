import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] ab = new int[n][2];
        long sum=0;
        boolean isAble = true;

        for (int i = 0; i < n; i++) {
            ab[i][0] = scanner.nextInt();
            ab[i][1] = scanner.nextInt();
        }

        Arrays.sort(ab, Comparator.comparingInt(t -> t[0]));
        Arrays.sort(ab, Comparator.comparingInt(t -> t[1]));

        for (int i = 0; i < n; i++) {
            sum += ab[i][0];
            if(sum > ab[i][1]){
                isAble=false;
                break;
            }
        }

        if(isAble){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}