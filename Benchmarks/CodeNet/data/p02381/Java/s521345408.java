import java.util.Scanner;

public class Main {

    public static double Average(int[] S, int N){
        double Sum = 0.0;
        for(int i = 0; i < N; i++){
            Sum += S[i];
        }
        Sum /= N;
        return Sum;
    }

    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       while(true){
        int n = sc.nextInt();
        if(n == 0){
            break;
        }
        int[] Score = new int[n];
        for(int i = 0; i < n; i++){
            Score[i] = sc.nextInt();
        }
        double Ave = Average(Score, n);
        double ScoreSum = 0.0;
        for(int i = 0; i < n; i++){
            ScoreSum += (Score[i] - Ave) * (Score[i] - Ave);
        }
        ScoreSum /= n;
        System.out.println(Math.sqrt(ScoreSum));
       }
       sc.close(); 
    }
}
