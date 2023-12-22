import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int temp = input.nextInt();

        if(temp >= 30)
        {
            System.out.println("Yes");
        }
        else
        {
                System.out.println("No");
        }
    }
}
