import java.util.*;

public class Main
    {
        public static void main (String[] args)
            {
                Scanner scanner = new Scanner(System.in);
                List<Integer> list = new ArrayList<Integer>();

                try
                    {
                        for (int i = 0; i < 3; i++)
                            {
                                list.add(scanner.nextInt());
                            }

                        Collections.sort(list);

                        for (int i = 0; i < 3; i++)
                            {
                                System.out.print(list.get(i));

                                if (i == 2)
                                    {
                                        System.out.println();
                                    }
                                else
                                    {
                                        System.out.print(" ");
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