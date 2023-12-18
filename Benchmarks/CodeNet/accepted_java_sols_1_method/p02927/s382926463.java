import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int M = scanner.nextInt();
        int D = scanner.nextInt();
        if(D < 22){
            System.out.println(0);
        } else {
            int count = 0;
            for(int i = 22; i <= D; i++){
                int d1 = i % 10;
                int d2 = i / 10;
                if(d1 >= 2 && d1 * d2 <= M){
                    count++;
                }
            }
            System.out.println(count);

        }

    }
}
