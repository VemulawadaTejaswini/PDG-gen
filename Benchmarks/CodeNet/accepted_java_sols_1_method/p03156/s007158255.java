import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] p = new int[n];
        int x = 0, y = 0, z = 0;
        for(int i = 0; i < n; i++){
            p[i] = sc.nextInt();
            if(p[i] <= a) x++;
            else if(p[i] <= b)y++;
            else z++;
        }
        System.out.println(Math.min(Math.min(x, y), z));
    }
}