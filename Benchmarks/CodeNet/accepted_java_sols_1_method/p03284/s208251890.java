import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();
        int out;
        if(N % K == 0)
            out = 0;
        else 
            out = 1;
        System.out.println(out);
    }
}
