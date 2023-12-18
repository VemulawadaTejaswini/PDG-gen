

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().start();
    }
    void start(){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[]a = new int[t];
        for(int i = 0; i < a.length;i++){
        	a[i] = in.nextInt();
        }

        int min = a[0];
        int maxRieki = Integer.MIN_VALUE;
        for(int i = 1; i < a.length; i++){
            int rieki = a[i] - min;
            if(a[i] < min) min = a[i];
            if(rieki > maxRieki) maxRieki = rieki;
        }
        System.out.println(maxRieki);
    }
}