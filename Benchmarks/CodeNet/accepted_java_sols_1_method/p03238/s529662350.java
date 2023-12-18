import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        if(age==1)
            System.out.println("Hello World");
        if(age==2)
        {
            int a = in.nextInt();
            int b= in.nextInt();
            System.out.println(a+b);
        }
    }
}