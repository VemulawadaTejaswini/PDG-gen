import java.util.Scanner;

public class Helloworld {
    public static void main(String[] args) {
        Scanner momoko= new Scanner(System.in);
        int num1 = momoko.nextInt();
        int num2 = momoko.nextInt();

        if(num1>num2)
            System.out.println("a > b");
        else if(num1<num2)
            System.out.println("a < b");
        else
            System.out.println("a == b");
    }
}
