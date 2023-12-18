import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        int count = 0;
        for(int i = 1; i<N; i++) {
            for(int j = 1;j<N; j++) {
                if((i * j) < N) {
                    count++;
                } else {
                    break;
                }
            }
        }
        
        System.out.println(count);

    }
}