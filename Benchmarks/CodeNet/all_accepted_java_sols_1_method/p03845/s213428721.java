import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mondai = sc.nextInt();
        int[] jikan = new int[mondai];
        for (int i = 0; i < mondai; i++) {
            jikan[i] = sc.nextInt();
        }
        int nomimono = sc.nextInt();
        int[] ans = new int[nomimono];
        for (int i = 0; i < nomimono; i++) {
            int koukamondai = sc.nextInt() - 1;
            int koukajikan = sc.nextInt();
            for (int j = 0; j < mondai; j++) {
                if (j == koukamondai) {
                    ans[i] += koukajikan;
                } else {
                    ans[i] += jikan[j];
                }
            }
        }
        for (int i = 0; i < nomimono; i++) {
            System.out.println(ans[i]);
        }
    }

}