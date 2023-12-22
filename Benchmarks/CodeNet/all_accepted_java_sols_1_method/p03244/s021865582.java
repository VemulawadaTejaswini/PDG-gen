import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[110000];
        int[] b = new int[110000];

        for(int i = 0; i < N/2; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            a[x]++;
            b[y]++;
        }
        int maxa = 0, maxb = 0;
        int maxaa = 0, maxbb = 0;
        for(int i = 1; i <= 100000; i++) {
            if(maxa < a[i]) {
                maxa = a[i];
                maxaa = i;
            }
            if(maxb < b[i]) {
                maxb = b[i];
                maxbb = i;
            }
        }
        if(maxaa != maxbb) {
            System.out.println(N - (maxa + maxb));
        } else {
            int maxaaa = 0, maxbbb = 0;
            int maxaaaa = 0, maxbbbb = 0;
            for(int i = 1; i <= 100000; i++) {
                if(i != maxaa && maxaaa < a[i]) {
                    maxaaa = a[i];
                    maxaaaa = i;
                }
                if(i != maxbb && maxbbb < b[i]) {
                    maxbbb = b[i];
                    maxbbbb = i;
                }
            }
            if(maxaaa > maxbbb) {
                System.out.println(N - (maxb + maxaaa));
            } else {
                System.out.println(N - (maxa + maxbbb));
            }
        }

    }
}
