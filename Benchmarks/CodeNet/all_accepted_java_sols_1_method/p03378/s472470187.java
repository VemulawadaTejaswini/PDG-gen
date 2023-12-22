import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), x = sc.nextInt();
        int[] a = new int[m];
        int cntl = 0, cntr = 0;
        for(int i = 0; i < m; i++){
            a[i] = sc.nextInt();
            if(a[i] < x) cntl++;
            else cntr++;
        }
        System.out.println(Math.min(cntl, cntr));
    }
}