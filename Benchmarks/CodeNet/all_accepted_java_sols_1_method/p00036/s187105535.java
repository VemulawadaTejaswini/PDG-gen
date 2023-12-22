// 2013 7/2
import java.lang.*;
import java.util.*;
//0022
public class Main
{
    static Scanner sc = new Scanner(System.in);
    static int n = 8;
    
    public static void main(String args[])
    {
        while( sc.hasNext() ){
            int[][] m = new int[n+6][n+6];

            for(int i=1; i<=n; i++){
                int p = sc.nextInt();
                for(int j=n; j>=1; j--){
                    if(p==0) m[i][j] = 0;
                    else {
                        m[i][j] = p % 10;
                        p /= 10;
                    }
                }
            }
            
            // for(int i=1; i<=n; i++){
            //     System.out.println();    
            //     for(int j=1; j<=n; j++){
            //         System.out.print(m[i][j]);    
            //    }
            // }
            
            String ans = "";
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    
                    if(m[i][j] + m[i+1][j] + m[i][j+1] + m[i+1][j+1] == 4)   ans = "A";
                    if(m[i][j] + m[i+1][j] + m[i+2][j] + m[i+3][j] == 4)     ans = "B";
                    if(m[i][j] + m[i][j+1] + m[i][j+2] + m[i][j+3] == 4)     ans = "C";
                    if(m[i][j] + m[i+1][j] + m[i+1][j-1] + m[i+2][j-1] == 4) ans = "D";
                    if(m[i][j] + m[i][j+1] + m[i+1][j+1] + m[i+1][j+2] == 4) ans = "E";
                    if(m[i][j] + m[i+1][j] + m[i+1][j+1] + m[i+2][j+1] == 4) ans = "F";
                    if(m[i][j] + m[i][j+1] + m[i+1][j] + m[i+1][j-1] == 4)   ans = "G";
                    
                    if(ans != "") break;
                }
            }
            System.out.println(ans);
            
        }
    }
}


	    