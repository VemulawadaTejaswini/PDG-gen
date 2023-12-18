import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
    {
        public static void main (String[] args)
            {
                System.out.println("任意の整数を入力してください\n");
                Scanner scanner = new Scanner(System.in);

                try
                    {
                        int input = scanner.nextInt();

                        System.out.println(input + "\n");
                        int result = (int) Math.pow(input, 3);

                        System.out.println(result + "\n");
                    }
                catch (InputMismatchException e)
                    {
                        System.out.println("整数を入力してください\n");
                        e.printStackTrace();
                    }
            }
    }