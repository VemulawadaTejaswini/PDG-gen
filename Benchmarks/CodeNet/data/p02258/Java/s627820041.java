import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] R = new int[n];
        for(int i = 0 ; i < n ; i++){
            R[i] = sc.nextInt();
        }
        
        int maxv = -2000000000;
        
        int minv = R[0];
        for(int i = 1 ; i < n ; i++){
            maxv = Math.max(maxv,R[i]-minv);
            minv = Math.min(minv,R[i]);
        }
        
        
        System.out.println(maxv);
    }
}
