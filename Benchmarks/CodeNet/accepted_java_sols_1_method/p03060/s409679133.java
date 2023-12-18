import java.util.*;

 
class Main {
 
    private static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] v = new int[n];
        int[] c = new int[n];
        for(int i = 0; i < n; i++){
            v[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            c[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            int val = v[i]-c[i];
             if(val > 0){
                ans += val;
            }
        }
        System.out.println(ans);
    }

}
