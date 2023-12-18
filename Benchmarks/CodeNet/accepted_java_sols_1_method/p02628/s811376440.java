import java.util.*;

public class Main {
    public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int k=sc.nextInt();
        Integer[] p=new Integer[n];
        for(int i=0;i<n;i++)
        p[i]=sc.nextInt();
        
        Arrays.sort(p);
        long sum=0;
        for(int i=0;i<k;i++)
        sum+=p[i];
 
 
      System.out.println(sum);
    }
}