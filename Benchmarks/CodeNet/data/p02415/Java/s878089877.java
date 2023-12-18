import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i] >= 'A' && c[i] <= 'Z')
            {
                c[i] = Character.toLowerCase(c[i])  ;
            } else if(c[i] >= 'a' && c[i] <= 'z')
            {
                c[i] = Character.toUpperCase(c[i])  ;
            }
        }
        
        System.out.println(String.valueOf(c));
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
