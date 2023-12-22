import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = sc.nextInt(), ans=0;
        int[][] x = new int[n][d];
        for(int i=0;i<n;i++)for(int j=0;j<d;j++)x[i][j]=sc.nextInt();
        for(int k=0;k<n;k++)for(int l=k+1;l<n;l++){
            int ret = 0;
            for(int m=0;m<d;m++)ret+=Math.pow((x[k][m]-x[l][m]), 2);
            if(isPerfectSquare(ret))ans+=1;
        }
        System.out.println(ans);
    }
    static boolean isPerfectSquare(double x){
        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq) == 0));
    }
}
class f{
    double ff(double d){
        return d * 2;
    }
}

