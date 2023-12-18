import java.io.*;
import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] num = new int[n];
        
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        
        for (int i = num.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.printf("%d ", num[i]);
            }
            else {
                System.out.printf("%d\n", num[i]);
            }
        }
    }
}