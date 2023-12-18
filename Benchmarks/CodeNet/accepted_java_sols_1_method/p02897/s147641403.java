
import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double p = 0;
        double n = 0;

        if(N == 1){
            p = 1;
        } else if(N % 2 == 0){
            p = 0.5;
        } else if(N % 2 == 1){
            n = (N - 1) / 2;
            p = ((double)N - n) / N;
        }

        System.out.println(p);


    }
}




