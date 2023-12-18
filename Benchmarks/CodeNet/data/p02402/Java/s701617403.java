import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner scan  = new Scanner(System.in);
        int N =scan.nextInt();
        int min =1000000, max = -1000000;
        long sum = 0;
        int[] score = new int [N];
        for (int i=0; i<N; i++){
        	score[i] = scan.nextInt();
        	sum += score[i];
        	if (min > score[i]) {
        		min = score[i];
        	}
        	if (max < score[i]) {
        		max = score[i];
        	}
        }
        System.out .println(min + " " + max +" " + sum);
	}
}

