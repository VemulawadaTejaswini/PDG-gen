import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main
    {
        public static void main (String[] args)
            {
                Scanner scanner = new Scanner(System.in);

                try
                    {
                        while (scanner.hasNextInt())
                            {
                                int x = scanner.nextInt();
                                int y = scanner.nextInt();

                                if (x != 0 && y != 0)
                                    {
                                        if (x > y)
                                            {
                                                int tmp = x;
                                                x = y;
                                                y = tmp;
                                            }

                                        System.out.println(x + " " + y);
                                    }
                                else
                                    {
                                        break;
                                    }
                            }

                    }
                catch (InputMismatchException e)
                    {
                        System.out.println("整数を入力してください");
                        e.printStackTrace();
                    }
            }
    }