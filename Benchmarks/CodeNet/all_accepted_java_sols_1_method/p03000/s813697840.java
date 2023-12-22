import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] l = new int[n+1];
        l[0]=0;
        for(int i=0;i<n;i++){
            l[i+1] = l[i] + sc.nextInt();
        }
        int ans = 0;
        for(int i=0;i<n+1;i++){
            if(l[i]<=x){
                ans = i+1;
            }
        }
        System.out.println(ans);
    }
}
