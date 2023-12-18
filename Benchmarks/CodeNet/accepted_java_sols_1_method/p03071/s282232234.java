import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int max = 0;
        int aa = a + (a - 1);
        int bb = b + (b - 1);
        int ab = a + b;
        
        if (max <= aa) {
            max = aa;
        }
        if (max <= bb) {
            max = bb;
        }
        if (max <= ab) {
            max = ab;
        }
        
        System.out.println(max);
        
    }
}