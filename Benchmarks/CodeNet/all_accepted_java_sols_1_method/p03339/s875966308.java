import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String S = scanner.next();
        int countW[] = new int[N];
        int countE[] = new int[N];
        int total[] = new int[N];
        int min = N;

        char c[] = new char[N];
        for(int i = 0; i < N; i++){
            c[i] = S.charAt(i);
        }
        for(int i = 0; i < N; i++){
            if(c[i] == 'W'){
                    countW[i] += 1;
            }
            if(c[N - i -1] == 'E'){
                    countE[N - i -1] += 1;
            }
        }
        for(int i = 1; i < N; i++){
            countW[i] += countW[i - 1];
            countE[N - i -1] += countE[N - i];
        }
        for(int i = 0; i < N; i++){
            if(i == 0){
                total[i] = countE[1];
            }else if(i == N - 1){
                total[i] = countW[N -2];
            }else{
                total[i] = countW[i - 1] + countE[i + 1];
            }
        }
        for(int i = 0; i < N; i++){
            if(total[i] < min){
                min = total[i];
            }
        }
        System.out.println(min);
    }
}