import java.util.Scanner;

/**
 *
 * @author joeco
 */
public class Sums {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        int[] q = new int[n];
        for(int i = 0; i < n; i++)
            q[i] = in.nextInt();
        int res = sums(q, 0);
        System.out.println(res);
    }
    
    public static int sums(int[] q, int start){
        int res = 0;
        for(int i = start+1; i<q.length;i++)
            res+= (q[start] * q[i])%(int)(Math.pow(10,9)+7);
        
        if(start+2<q.length) res+=sums(q, start+1);
        
        return res;
    }
    
}