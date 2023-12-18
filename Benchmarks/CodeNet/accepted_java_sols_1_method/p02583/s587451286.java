import java.util.*;

public class Main {

    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] line = new int[n];
        int sum = 0;

        for (int i = 0; i<n; i++) {
            int a = scan.nextInt();
            line[i] = a;
        }

        for (int i = 0; i<n; i++) {
            int a = line[i];

            for (int j = i+1; j<n; j++) {
                int b = line[j];

                if (a==b) {
                    continue;
                }

                for (int k = j+1; k<n; k++) {

                    int c = line[k];

                    if (a==c || b==c) {
                        continue;
                    }

                    if (a + b > c && a + c > b && b + c >a) {
                        sum++;
                    }

                }
            }
        }

        System.out.println(sum);
    }
}