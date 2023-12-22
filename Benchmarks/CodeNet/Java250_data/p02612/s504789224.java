import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        N = Math.abs(N-10000);
        System.out.println(N%1000);
    }
}
