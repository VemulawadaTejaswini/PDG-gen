import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] h = new Integer[n];
        int maxHeight = 0;
        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(sc.next());
            maxHeight = Math.max(maxHeight, h[i]);
        }

        int result = 0;
        for (int j = 0; j < maxHeight; j++) {
            boolean edgeFlag = true;
            for (int i = 0; i < n; i++) {
                if (h[i] > 0) {
                    h[i]--;
                    edgeFlag = false;
                } else if (!edgeFlag) {
                    result++;
                    edgeFlag = true;
                }
            }
            if (!edgeFlag) {
                result++;
            }
        }

        System.out.println(result);
    }
}