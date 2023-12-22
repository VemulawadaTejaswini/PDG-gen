import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());
        String answer = new String();
        for(int i = X-K+1 ; i < X+K ; i++){
            answer += i+ " ";
        }
        System.out.println(answer);
    }
}