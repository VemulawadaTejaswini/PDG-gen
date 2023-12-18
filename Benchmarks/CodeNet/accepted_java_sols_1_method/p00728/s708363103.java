import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        int[] mean = new int[20];
        int cnt=0;
        while(true){
            n = sc.nextInt();
            if(n == 0){
                break;
            }
            int[] score = new int[n];
            for(int i=0; i<n; i++){
                score[i] = sc.nextInt();
            }
            Arrays.sort(score);  // 昇順にソート
            int sum=0;
            for(int i=1; i<n-1; i++)
                sum += score[i];
            mean[cnt] = sum/(n-2);
            cnt++;
        }

        for(int i=0; i<cnt; i++){
            System.out.println(mean[i]);
        }

        sc.close();
    }
}
