import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int flag = b * 2 + 1;
        if(a % flag == 0) System.out.println(a / flag);
        else System.out.println(a / flag + 1);
    }
}
