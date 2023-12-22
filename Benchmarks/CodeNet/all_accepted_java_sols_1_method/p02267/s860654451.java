import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nums[] = new int[in.nextInt()];
        for (int i = 0; i < nums.length; i++)
            nums[i] = in.nextInt();
        int numx[] = new int[in.nextInt()];
        for (int i = 0; i < numx.length; i++)
            numx[i] = in.nextInt();
        int counter = 0;
        for (int x = 0; x < nums.length; x++) {
            int index = 0;
            for (int y = 0; y < numx.length; y++) {
                if (nums[x] == numx[y]) {
                    ++counter;
                    numx[index] = 10001;
                }
                index++;
            }
        }
        System.out.println(counter);
    }
}

