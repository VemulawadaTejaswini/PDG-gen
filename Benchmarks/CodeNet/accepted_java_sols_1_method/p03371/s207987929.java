import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int x = scn.nextInt();
        int y = scn.nextInt();
        ArrayList<Long> arr = new ArrayList<>();
        arr.add((long) (a * x + b * y));
        long s = 0;
        int q = Math.min(x, y);
        int dif = Math.abs(x - y);
        if (x > y)
        {
            s = 2 * q * c + (x - y) * a;
        }
        else
        {
            s = 2 * q * c + (y - x) * b;
        }
        arr.add(s);
        arr.add((long) (Math.max(x, y) * c * 2));
        Collections.sort(arr);
        System.out.println(arr.get(0));
    }
}
