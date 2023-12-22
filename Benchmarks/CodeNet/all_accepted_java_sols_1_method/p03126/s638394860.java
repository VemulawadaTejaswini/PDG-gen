import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m=sc.nextInt();
        int[] count = new int[m];
        int ans = 0;
        for(int i = 1;i<=n;i++){
            int k = sc.nextInt();
            for(int j = 0;j<k;j++){
                count[sc.nextInt()-1] ++;
            }
        }
        for(int i =0;i<m;i++){
            if(count[i]==n){
                ans ++;
            }
        }
        System.out.println(ans);
    }
}