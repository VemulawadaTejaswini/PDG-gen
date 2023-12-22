import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        if(a1 +a2 +a3 >=22)

        {
            System.out.print("bust");
        } else

        {
            System.out.print("win");
        }
    }
}