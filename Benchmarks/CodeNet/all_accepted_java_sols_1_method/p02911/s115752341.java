import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] qq = new int[q];
        for(int i=0; i<q; i++) {
            qq[i] = sc.nextInt();
        }
        long[] nn = new long[n+1];
        int c = k -q;
        for(int i=0; i<nn.length; i++) {
            nn[i] = c;
        }
        for(int i=0; i<qq.length; i++) {
            nn[qq[i]]++;
        }
        for(int i=1; i<nn.length; i++) {
            if(nn[i] > 0) System.out.println("Yes");
            else System.out.println("No");
        }

    }
}