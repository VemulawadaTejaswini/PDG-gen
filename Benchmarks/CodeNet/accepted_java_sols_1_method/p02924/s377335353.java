
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n= in.nextLong();
        long ans= ((n-1)*n)/2;
        System.out.println(ans);

    }
}
