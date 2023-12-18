import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        int length = scan1.nextInt();
        int[] arr = new int[length];
        long sum = 0;



            for (int i = 1; i <= length; i++)
            {
                if (i%3 == 0 && i%5 == 0)
                    arr[i-1] = 0;
                else if (i%3 == 0 || i % 5 == 0)
                    arr[i-1] = 0;
                else
                    arr[i-1] = i;
            }
            for (int j : arr )
            {
                sum += j;
            }
        System.out.println(sum);
    }
}
