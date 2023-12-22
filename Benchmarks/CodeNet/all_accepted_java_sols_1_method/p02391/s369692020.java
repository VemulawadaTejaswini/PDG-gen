import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
    {
        public static void main (String[] args)
            {
                Scanner scanner = new Scanner(System.in);

                try
                    {
                        int inputA = scanner.nextInt();
                        int inputB = scanner.nextInt();

                        if (inputA > inputB)
                            {
                                System.out.println("a > b");
                            }
                        else if (inputA < inputB)
                            {
                                System.out.println("a < b");
                            }
                        else
                            {
                                System.out.println("a == b");
                            }
                    }
                catch (InputMismatchException e)
                    {
                        System.out.println("整数を入力してください");
                        e.printStackTrace();
                    }
            }
    }