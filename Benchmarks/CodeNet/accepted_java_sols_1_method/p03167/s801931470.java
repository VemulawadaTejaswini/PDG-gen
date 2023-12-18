import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        char mat[][] = new char[n][m];
        for(int i=0;i<n;i++){
                mat[i] = in.next().toCharArray();
        }
        int ans[][] = new int[n][m];
        ans[0][0] = 1;
        int mod = (int)Math.pow(10,9)+7;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == '.'){
                    if((j+1) < m){
                        ans[i][j+1] = (ans[i][j]%mod + ans[i][j+1]%mod)%mod;
                    }
                    if((i+1) < n){
                        ans[i+1][j] = (ans[i][j]%mod + ans[i+1][j]%mod)%mod;
                    }
                }else{
                    ans[i][j] = 0;
                }
            }
        }
     
        System.out.println(ans[n-1][m-1]);

    }

}