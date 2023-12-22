import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numOfPeople = sc.nextInt();
        Boolean[] isExist = new Boolean[numOfPeople];
        for (int i = 0; i < numOfPeople; i++) {
            isExist[i] = false;
        }
        int numOftype = sc.nextInt();
        int[] nowType = new int[numOftype];
        int[][] A = new int[numOftype][numOfPeople];
        int ans = 0;

        for (int i = 0; i < numOftype; i++) {
            nowType[i] = sc.nextInt();
            for (int j = 0; j < nowType[i]; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < numOftype; i++) {
            for (int j = 0; j < nowType[i]; j++) {
                for (int k = 0; k < numOfPeople; k++) {
                    if (A[i][j] == k + 1) {
                        isExist[k] = true;
                    }
                }
            }
        }
        for (int i = 0; i < numOfPeople; i++) {
            if (!isExist[i]) {
                ans++;
            }

        }

        System.out.println(ans);
    }
}
