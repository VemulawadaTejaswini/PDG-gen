import java.io.*;
import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] array = new int[n];
        
        for (int i = 0; i < n ; i++) {
            array[i] = sc.nextInt();
        }
        
        int max = array[0];
        int min = array[0];
        long sum = 0;
        
        for (int i = 0; i < n; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
            sum += array[i];
        }
        
        System.out.printf("%d %d %d\n", min, max, sum);
    }
}