import java.util.Scanner;

/**
 * Created by Reopard on 2014/05/07.
 */
public class Main {
    public static void main(String args[]){
        int Taro_score[] = new int[100];
        int Hanako_score[] = new int[100];
        int answer[] = new int[2];
        int n, m, score_sum, Taro_sum, Hanako_sum;
        Scanner sc = new Scanner(System.in);
        while(true){
            n = sc.nextInt();
            m = sc.nextInt();
            if(n == 0 && m == 0) break;
            for(int i = 0; i < answer.length; i++) answer[i] = 101;
            for(int i = 0; i < n; i++) Taro_score[i] = sc.nextInt();
            for(int i = 0; i < m; i++) Hanako_score[i] = sc.nextInt();
            Taro_sum = sum(Taro_score, n);
            Hanako_sum = sum(Hanako_score, m);
            score_sum = Taro_sum + Hanako_sum;
            if(score_sum % 2 == 1){
                System.out.println(-1);
                continue;
            }
            score_sum /= 2;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(Math.abs(score_sum - Taro_sum) == Math.abs(Taro_score[i] - Hanako_score[j])
                            && Taro_score[i] + Hanako_score[j] < answer[0] + answer[1]){
                        answer[0] = Taro_score[i];
                        answer[1] = Hanako_score[j];
                    }
                }
            }
            if(answer[0] <= 100 && answer[1] <= 100) System.out.println(answer[0] + " " + answer[1]);
            else System.out.println(-1);
        }
    }

    static int sum(int arr[], int n){
        int tmp = 0;
        for(int i = 0; i < n; i++) tmp += arr[i];
        return tmp;
    }
}