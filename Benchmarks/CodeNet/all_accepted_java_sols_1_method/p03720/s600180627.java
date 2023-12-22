import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int m = scan.nextInt();
        
        int[] a = new int[m];
        int[] b = new int[m];
        
        for(int i=0;i<a.length;i++)
        {
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
        }
        
        int count=0;
        for(int i=0;i<n;i++)
        {
            count=0;
            for(int j=0;j<a.length;j++)
            {
                if(a[j]==i+1)
                {
                    count++;
                }
                if(b[j]==i+1)
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}