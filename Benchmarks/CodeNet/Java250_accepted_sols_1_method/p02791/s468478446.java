import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i = 0 ; i<n;i++){
            p[i] = sc.nextInt();
        }
        int ans = 1;
        boolean[] b = new boolean[n];
        b[0] = true;
        int j = 0;
        for(int i = 1;i<n;i++){
            if(b[j]){
                if(p[i]<=p[j]){
                    b[i] = true;
                    j = i;
                    ans ++;
                } else {
                    b[i] = false;
                }
            }
        }
        System.out.println(ans);
    }
}