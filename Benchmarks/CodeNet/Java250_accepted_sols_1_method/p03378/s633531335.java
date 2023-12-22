import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int a = 0;
        int b = 0;
        for(int i = 0; i < M; i++){
            int c = sc.nextInt();
            if(c < X) a++;
            else b++;
        }
        System.out.println(Math.min(a, b));
        sc.close();

    }

}
