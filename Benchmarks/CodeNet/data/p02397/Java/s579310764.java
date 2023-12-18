import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main
    {
        public static void main (String[] args)
            {
                Scanner scanner = new Scanner(System.in);
                List<Integer> listX = new ArrayList<Integer>();
                List<Integer> listY = new ArrayList<Integer>();

                try
                    {
                        while (scanner.hasNextInt())
                            {
                                int tmpX = scanner.nextInt();
                                int tmpY = scanner.nextInt();

                                if (tmpX != 0 && tmpY != 0)
                                    {
                                        listX.add(tmpX);
                                        listY.add(tmpY);
                                    }
                                else
                                    {
                                        break;
                                    }
                            }

                        for (int i = 0; i < listX.size(); i++)
                            {
                                if (listX.get(i) > listY.get(i))
                                    {
                                        int tmp = listX.get(i);
                                        listX.set(i, listY.get(i));
                                        listY.set(i, tmp);
                                    }

                                System.out.println(listX.get(i) + " " + listY.get(i));
                            }
                    }
                catch (InputMismatchException e)
                    {
                        System.out.println("整数を入力してください");
                        e.printStackTrace();
                    }
            }
    }