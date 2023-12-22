import java.util.Scanner;

public class Main {

    public static void main(String[] args) { // 33m30s AC

        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        String[] pn = sc.nextLine().split(" ");

        int badPlaceCount = 0;
        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(pn[i]) != i + 1) {
                badPlaceCount++;
            }
        }

        if (badPlaceCount == 2 || badPlaceCount == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
