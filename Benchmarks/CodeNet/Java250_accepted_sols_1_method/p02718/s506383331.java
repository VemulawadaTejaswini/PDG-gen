import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] Ai = new int[n];
        double totalVotes = 0;
        for (int i = 0; i < n; i++) {
            Ai[i] = sc.nextInt();
            totalVotes += Ai[i];
        }
        int changeValue;
        int max;
        for (int i = 0; i < n; i++) {
            max = Ai[n - 1];
            for (int j = n - 2; j >= i; j--) {
                if (max > Ai[j]) {
                    changeValue = Ai[j];
                    Ai[j] = Ai[j + 1];
                    Ai[j + 1] = changeValue;
                } else {
                    max = Ai[j];
                }
            }
        }

        totalVotes = totalVotes / 4 / m;
        boolean flag = true;
        for (int i = 0; i < m; i++) {
            if ((double)Ai[i] < totalVotes) {
                flag = false;
            }
        }

        if (flag == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}