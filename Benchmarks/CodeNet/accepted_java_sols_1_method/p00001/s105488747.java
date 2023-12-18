
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mtHight = new int[10];
        for (int i = 0; i < 10; i++){
            mtHight[i] = sc.nextInt();
        }
        Arrays.sort(mtHight);
        System.out.println(mtHight[9]);
        System.out.println(mtHight[8]);
        System.out.println(mtHight[7]);
    }
}

