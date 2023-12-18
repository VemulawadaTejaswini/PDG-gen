import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] primeList = new int[5134];//5134
        int limit = 50001;
        primeList[0] = 2;
        primeList[1] = 3;
        int count = 2;
        for (int i = 5; i < limit; i += 2) {
            boolean wflag = true;
            for (int j = 1; primeList[j] * primeList[j] <= i; j++) {
                if (i % primeList[j] == 0) {
                    wflag = false;
                    break;
                }
            }
            if (wflag) {
                primeList[count++] = i;
            }
        }
        int[] l = new int[limit];
        for (int i = 0; primeList[i]>0; i++) {
            for (int j = i; primeList[j]>0; j++) {
                int s = primeList[i] + primeList[j];
                if (s < limit) {
                    l[s]++;
                }
            }
        }
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            System.out.println(l[n]);
        }

    }
}

