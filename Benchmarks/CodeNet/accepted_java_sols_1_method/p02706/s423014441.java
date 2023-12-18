import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int day = 0;
        for (int i = 0; i < M; i++) {
                day += scan.nextInt();
        }
        if(day>N){
            System.out.println(-1);
        }
        else{
            System.out.println(N-day);
        }
    }
}

