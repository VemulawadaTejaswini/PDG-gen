import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        for(int i=0; i<M; i++) {
            N -= scan.nextInt();
        }
        System.out.println(N>=0?N:-1);
    }
}