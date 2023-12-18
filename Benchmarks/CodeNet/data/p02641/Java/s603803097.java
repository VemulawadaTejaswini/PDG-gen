
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int X = sc.nextInt();
    static int N = sc.nextInt();

    public static void main(String[] args) {
        if(N == 0){
            System.out.println(X);
            return;
        }

        int p[] = new int[N];
        for(int i = 0; i < N; i++){
            p[i] = sc.nextInt();
        }
        int num[] = new int[100];
        for(int j = 0; j < 100; j++){
            num[j] = j + 1;
        }

        for(int i = 0; i < 100; i++){
            for(int j = 0; j < N; j++){
                if(num[i] == p[j]){
                    num[i] = 0;
                    break;
                }
            }
        }
        int resultBigger = 100;
        int resultSmaller = 100;
        for(int i = 0; i < 100; i++){
            if(X > num[i]){
                if(Math.abs(X - num[i]) < Math.abs(X - resultSmaller)){
                    resultSmaller = num[i];
                }
            } else {
                if(Math.abs(X - num[i]) < Math.abs(X - resultBigger)){
                    resultBigger = num[i];
                }
            }
        }
        int diff = Math.abs(X - resultSmaller) - Math.abs(X - resultBigger);
        if(diff == 0){
            System.out.println(resultSmaller);
        } else if (diff < 0){
            System.out.println(resultSmaller);
        } else {
            System.out.println(resultBigger);
        }
    }
    
}