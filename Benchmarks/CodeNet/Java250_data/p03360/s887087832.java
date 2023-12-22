 import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int A = readInt();
        int B = readInt();
        int C = readInt();

        int K = readInt();

        int BIG = Math.max(A, Math.max(B, C));

        int ans;

        K = (int) Math.pow((double)2, (double)K);

        if(A == BIG){
            ans = A*K + B + C;
        }else if(B == BIG){
            ans = A + B*K + C;
        }else{
            ans = A + B + C*K;
        }

        System.out.println(ans);


    }

    private static int readInt(){
        return Integer.parseInt(sc.next());
    }

    private static long readLong(){
        return Long.parseLong(sc.next());
    }

}
