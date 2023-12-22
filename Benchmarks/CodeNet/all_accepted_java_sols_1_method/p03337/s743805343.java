import java.io.*;
import java.util.*;
 
 
class Main
{
    public static void main(String[] args)
    {
        int x,y,z;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        x = a + b;
        y = a -b;
        z = a * b;
        int[] array = {x,y,z};
        Arrays.sort(array);
        System.out.println(array[2]);
        scanner.close();
    }
}