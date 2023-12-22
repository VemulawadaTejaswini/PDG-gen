import java.util.Scanner;

public final class Main {
    public static void main(String[] args){

        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int k = stdIn.nextInt();

        System.out.println(n-k+1);

    }
}
