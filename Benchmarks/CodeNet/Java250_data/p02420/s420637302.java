import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            String s = sc.next();
            if(s.equals("-"))break;

            char[] chars = s.toCharArray();
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < n; i++) {
               sum += sc.nextInt();
            }
            for (int i = 0; i < chars.length; i++) {
                System.out.print(chars[(sum+i)%chars.length]);
            }
            System.out.println();
        }

        sc.close();
    }
    
    public static void printary(int[] a)
    {
        for ( int i = 0; i < a.length; i++) {
            if(i>0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
