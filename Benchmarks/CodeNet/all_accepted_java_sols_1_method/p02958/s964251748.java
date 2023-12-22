import java.util.Scanner;

public class Main {
    public static int N = 0;
    public static int[] p;

    public static void main(String[] args) {

        String[] pStrArray;

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.nextLine();

        pStrArray = sc.nextLine().split(" ");
        p = new int[N];
        for (int i=0; i<N; i++) {
            p[i] = Integer.parseInt(pStrArray[i]);
        }

        int compareCount = 0;
        for (int i=0; i<N; i++) {
            if (p[i] != i+1) {
                compareCount++;
            }
        }

        String output = "";
        for (int i=0; i<N; i++) {
            if (compareCount == 0 || compareCount == 2) {
                output = "YES";
            } else {
                output = "NO";
            }
        }
        System.out.println(output);
    }
}
