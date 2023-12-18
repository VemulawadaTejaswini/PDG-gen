import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.awt.geom.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;
public class Main{
    public static void main(String[] args){

    int N = 1001;
    Scanner sch = new Scanner(System.in);
    int i,k,l,m[][]=new int[N+1][N+1],p[]=new int[N+1];
    int[] c = new int[201];
    int n = sch.nextInt();
    
    for( i = 1; i <= n; i++){
        p[i-1] = sch.nextInt();
        p[i] = sch.nextInt();
        m[i][i]=0;
    }
    
    
    for( i = 2; i <= n; ++i) {
        for(int j = 1; j <= n - i + 1; j++){
        k = j + i - 1;
        m[j][k] = Integer.MAX_VALUE;
      
        for( l = j; l <= k - 1; ++l){
            m[j][k] = Math.min(m[j][k],m[j][l] + m[l+1][k] + p[j-1] * p[l] * p[k]);
        }
        }
    }
    System.out.println(m[1][n]);

    }
}
