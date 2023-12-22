import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r =sc.nextInt();
        int D = sc.nextInt();
        int x = sc.nextInt();
        
        int nextX = x;

        for(int i = 0; i < 10; i++){
            nextX = r * nextX - D;
            System.out.println(nextX);
        }
    }
}