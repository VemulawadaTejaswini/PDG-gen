import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] dam = new int[N];

        for (int i = 0; i < N; i++) {
            dam[i]=sc.nextInt();
        }
        int r02 = 0;
        for (int i = 0; i <N ; i++) {
            r02 += dam[i] * ((i%2==1)? -1 : 1);
        }

        System.out.print(r02+" ");
        int r = r02/2;
        for (int i = 0; i <N-1 ; i++) {
            r = dam[i]-r;
            System.out.print(r*2+" ");
        }


    }

}
