import java.util.*;

public class Main {
    public static void main(String[] args)  {
       Scanner sc = new Scanner(System.in);
       
       int n = sc.nextInt();
       int r[] = new int[n];
       for(int i=0;i<n;i++){
           r[i] = sc.nextInt();
       }
       
       int min = r[0];
       int max = r[1]-r[0];
       
       for(int i=1;i<n;i++){
             max = Math.max(max,r[i]-min);
             min = Math.min(min,r[i]);
       }
       
       System.out.println(max);
    }
}

