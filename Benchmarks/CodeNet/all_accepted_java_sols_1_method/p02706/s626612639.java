    import java.util.*;
     
    public class Main{
      public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum = 0;
        for(int i = 0 ; i < m; i++)sum += in.nextInt();
        
        System.out.println((sum > n) ? -1 : n - sum);
      }
    }