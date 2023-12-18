import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int answer = 0;
        int tap = 1;
        while(tap<B){
            tap = tap -1 + A;
            answer ++;
        }

        System.out.println(answer);

    }
}