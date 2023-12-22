import java.util.*;
public class Main {
    public static void main(String[] args) {
        //data input
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] box = new int[N];

        for (int i = 0; i < N; i++) {
            box[i] = sc.nextInt();
        }

        // get sum

        long output = 0;
        for (int i = 0; i < box.length; i++) {
            for (int j = i + 1; j < box.length; j++) {
                output += (box[i] * box[j]);
            }
        }

        System.out.println(output);
    }
}