import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i=0; ; ++i) {
            int sum = 0;
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int[] score = new int[n];
            for (int j = 0; j < n; ++j) {
                score[j] = sc.nextInt();
            }
            Arrays.sort(score);
            for(int j=1; j<score.length-1; ++j){
                sum += score[j];
            }
            int average = sum/(n-2);
            System.out.println(average);
        }
    }

 }