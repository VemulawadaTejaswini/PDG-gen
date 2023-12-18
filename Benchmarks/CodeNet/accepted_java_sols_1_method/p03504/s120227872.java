import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        sc.nextLine();

        int s[] = new int[N];
        int t[] = new int[N];
        int c[] = new int[N];
        for (int i = 0; i < N; i++) {
            s[i] = sc.nextInt();
            t[i] = sc.nextInt();
            c[i] = sc.nextInt();
            sc.nextLine();
        }
        sc.close();

        int channelTotalTable[] = new int[100001];
        for(int i = 0; i < 100001; i++) {
            channelTotalTable[i] = 0;
        }

        int channelTable[][] = new int[C][100001]; 
        for (int i = 0; i < C; i++) {
            for (int j = 0; j < 100001; j++) {
                channelTable[i][j] = 0;
            }
            for (int k = 0; k < N; k++) {
                if (c[k] == i + 1) {
                    if (s[k] == 1) {
                        channelTable[i][0] = 1;
                    } else if (channelTable[i][s[k] - 1] == -1) {
                        channelTable[i][s[k] - 1] = 0;
                    } else {
                        channelTable[i][s[k] - 1] += 1;
                    }
                    channelTable[i][t[k]] -= 1;
                }
            }
            for (int l = 1; l < 100001; l++) {
                channelTable[i][l] += channelTable[i][l - 1];
            }
            for (int m = 0; m < 100001; m++) {
                if (channelTable[i][m] > 0) {
                    channelTotalTable[m]++;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < 100000; i++) {
            if (max < channelTotalTable[i]) {
                max = channelTotalTable[i];
            }
        }
        System.out.println(max);
    }
}
