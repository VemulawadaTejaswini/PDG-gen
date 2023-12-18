import java.util.*;

public class Main {

    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int list[] = new int[n];
        int sum =0;

        for (int i = 0; i<n; i++ ) {
            int p = scan.nextInt();
            list[i] = p;
        }

        for (int i = 0; i<n; i++) {
            boolean nodiv = true;
            for (int j = 0; j <n; j++) {
                if(i != j) {
                    if(list[i] % list[j] == 0) {
                        nodiv = false;
                        break;
                    }
                }
            }
            if (nodiv) {
                sum++;
            }
        }

        System.out.println(sum);
    }
}