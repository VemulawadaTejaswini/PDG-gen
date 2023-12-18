import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int r = sc.nextInt();
            if(n==0 && r==0) break;
            int ans[] = new int[n];
            for(int i = 0; i<n; i++){
                ans[i] = n-i;
            }
            for(int i = 0; i<r; i++){
                int p = sc.nextInt();
                int c = sc.nextInt();
                int tmp[] = new int[p+c-1];
                for(int j = 0; j<p+c-1; j++){
                    tmp[j] = ans[j];
                }
                for(int j = p-1; j<p+c-1; j++){
                    ans[j-p+1] = tmp[j];
                }
                for(int j = 0; j < p-1; j++){
                    ans[j+c] = tmp[j];
                }
            }
            System.out.println(ans[0]);
           
        }
        sc.close(); 
    }
}
