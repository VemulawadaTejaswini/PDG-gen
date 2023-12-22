// 2013 7/2
import java.lang.*;
import java.util.*;
//1179
public class Main
{
    static Scanner sc = new Scanner(System.in);
        
    public static void main(String args[])
    {
        int[][][] p = new int[1001][11][21];
        int c=1;
        int k=0;
        for(int i=999; i>0; i--){ 
            for(int j=10; j>0; j--){
                if(j%2 == 1 || i%3 == 0)  k = 20;
                else  k = 19;
                for(; k>0; k--){
                    p[i][j][k] = c++;
                                        
                }
            }
        }
        
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println(p[sc.nextInt()][sc.nextInt()][sc.nextInt()]);
            
        }
        
                         
        
    }
}


	    