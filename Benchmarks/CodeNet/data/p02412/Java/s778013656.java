import java.io.*;
import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int x = sc.nextInt();
        
        while (n != 0 || x != 0) {
            int sum = 0;
            
            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    for (int k = j + 1; k <= n; k++) {
                        if (i + j + k == x) {
                            sum++;
                        }
                    }
                }
            }
            
            System.out.println(sum);
            
            n = sc.nextInt();
            x = sc.nextInt();
        }
    }
}