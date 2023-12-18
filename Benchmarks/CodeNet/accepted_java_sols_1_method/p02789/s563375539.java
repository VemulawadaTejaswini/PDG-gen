import java.util.Scanner;

public class Main {

    private static int N;
    private static int M;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        
        System.out.println(N==M ? "Yes" : "No");

    }

}
