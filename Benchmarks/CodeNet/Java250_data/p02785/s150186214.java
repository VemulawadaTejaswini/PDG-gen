import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner str = new Scanner(System.in);
        int N = str.nextInt();
        int K = str.nextInt();

        long result = 0;

        long NList[] = new long[N];

        for(int i = 0; i < N; i++){
            NList[i] = str.nextLong();
        }

        Arrays.sort(NList);

        for(int i = N - 1 - K; i >= 0; i--){
            result += NList[i];
        }

        System.out.println(result);

        str.close();
    }
}