import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i] = scan.nextInt();
        }
        
        int tmp = 1;
        for(int i=0;i<a.length;i++)
        {
            tmp = a[tmp-1];
            if(tmp==2)
            {
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(-1);
    }
}