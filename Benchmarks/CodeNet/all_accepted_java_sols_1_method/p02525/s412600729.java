import java.util.Scanner;

public class Main {
	 
	 
	    public static void main(String[] args) {
	 
	        Scanner sc = new Scanner(System.in);
	 
	        while (true) {
	            int x = sc.nextInt();
	            if (x == 0) break;
	            double ave = 0;
	            int[] score = new int[x];
	            for (int i = 0; i < x; i++) {
	                score[i] = sc.nextInt();
	                ave += score[i];
	            }
	            ave /= x;
	            double sl = 0;
	            for (int i = 0; i < x; i++)
	                sl += Math.pow(score[i] - ave, 2);
	            sl /= x;
	            System.out.println(Math.sqrt(sl));
	        }
	 
	    }
	 
	}