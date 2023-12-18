import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(String.format("%d %d %f", (int)(a / b), a % b, (double)a / b));
    }
}

