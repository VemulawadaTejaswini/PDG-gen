import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(y < 2 * x || 4 * x < y){
            System.out.println("No");
            return;
        }

        if(y % 2 == 1){
            System.out.println("No");
            return;
        }

        System.out.println("Yes");
    }
}
