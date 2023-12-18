
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n= in.nextInt();

        double odds=(n%2==0)?n/2:(n/2+1);
        double evens=n-odds;
        double ans= odds/n;
        System.out.println(ans);


    }
}
