import java.util.Scanner;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n != 0) {
            int[] score = new int[n];

            for(int i = 0; i < n; i++)
                score[i] = sc.nextInt();

            sort(score);

            int ave = 0;

            for(int i = 1; i < score.length - 1; i++)
                ave += score[i];

            ave /= n - 2;

            System.out.println(ave);

            n = sc.nextInt();
        }
        sc.close();
    }
}

