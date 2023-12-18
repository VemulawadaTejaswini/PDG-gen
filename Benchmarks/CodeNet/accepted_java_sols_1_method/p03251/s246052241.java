import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        for(int i = 0; i < N; i++){
            int x = sc.nextInt();
            if(x > X) X = x;
        }
        for(int j = 0; j < M; j++){
            int y = sc.nextInt();
            if(y < Y) Y = y;
        }
        sc.close();
        if(X < Y) System.out.println("No War");
        else System.out.println("War");

    }

}
