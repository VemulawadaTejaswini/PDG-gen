import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int val = 0;
        int[] V=new int[N];
        int[] C=new int[N];
        for (int i = 0; i < N; i++) {
            V[i]=sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            C[i]=sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int v = V[i]-C[i];
            if(v > 0 ){
                val += v;
            }
        }


        System.out.println(val);
    }

}