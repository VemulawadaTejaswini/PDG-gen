
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int answer = (a + b);
        if(answer % 2 == 0) System.out.println(answer/2);
        else System.out.println("IMPOSSIBLE");
    }
}