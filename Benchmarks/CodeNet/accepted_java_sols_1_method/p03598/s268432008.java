import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int k = scan.nextInt();
        
        int[] x = new int[n];
        for(int i=0;i<x.length;i++)
        {
            x[i] = scan.nextInt();
        }
        
        int cost=0;
        for(int i=0;i<x.length;i++)
        {
            cost += Math.min(2*x[i],Math.abs(x[i]-k)*2);
        }
        
        System.out.println(cost);
    }
}