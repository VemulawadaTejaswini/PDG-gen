import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        Integer A = scan.nextInt();
        Integer B = scan.nextInt();
        Integer C = scan.nextInt();
        Integer answer = 0;
        if(A-B < C) {
            answer = C-A+B;
        }
        else {
            answer = 0;
        }
        System.out.println(answer);
    }
}