import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        int n = a.length();
        int m = b.length();
        int ans[][] = new int[n+1][m+1];
        for(int i=0;i<n;i++){
            ans[i][0] = 0;
        }
        for(int i=0;i<m;i++){
            ans[0][i] = 0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    ans[i][j] = ans[i-1][j-1] + 1;
                }else{
                    ans[i][j] = Math.max(ans[i-1][j],ans[i][j-1]);
                }
            }
        }
        String str = "";
        int r = n;
        int c = m;
        while(true){
            if(r==0 || c==0){
                break;
            }
            if(a.charAt(r-1)==b.charAt(c-1)){
                str+=a.charAt(r-1);
                r--;
                c--;
            }else{
                if(ans[r-1][c]>ans[r][c-1]){
                    r--;
                }else{
                    c--;
                }
            }
        }
        StringBuilder temp = new StringBuilder(str);
        System.out.println(temp.reverse());
    }

}