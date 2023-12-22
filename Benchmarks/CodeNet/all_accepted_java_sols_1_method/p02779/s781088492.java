import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i=0;i<n;i++)
            a[i] = sc.nextInt();

        Arrays.sort(a);
        boolean check = false;
         for(int i=0;i<n-1;i++)
         {
             if(a[i]==a[i+1])
             {
                 System.out.println("NO");
                 check = false;
                 break;
             }
             else
                 check = true;
         }
         if(check)
             System.out.println("YES");
    }
}
