import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] ary = new int[n+1];
        int ans = 0;
        for (int i = 1; i < k+1 ; i++){
            for(int d = scan.nextInt(); d>0 ; d--){
                ary[scan.nextInt()] ++;
            }
        }
        for (int i = 1; i<=n ; i++){
            if (ary[i]==0){
                ans ++;
            }
        }
        System.out.println(ans);
            }
        }