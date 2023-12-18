
import java.util.Arrays;
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();


            long[] h=new long[n];
            for(int i=0;i<n;i++){
                h[i]=in.nextInt();
            }
        if(k>=n) {
            System.out.println(0);
        }
        else {
            long attacks = 0;
            Arrays.sort(h);
            for (int i = n - 1; i >= 0; i--, k--) {
                if (k <= 0) {
                    attacks += h[i];
                }
            }
            System.out.println(attacks);
        }

    }
}
