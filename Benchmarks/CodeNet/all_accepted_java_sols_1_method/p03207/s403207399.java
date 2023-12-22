import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        int p[] = new int[10];
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            p[i] = sc.nextInt();
        }
        Arrays.sort(p);
        int ans = 0;
        for(int i=0;i<9;i++){
            ans += p[i];
        }
        ans += p[9]/2;
        System.out.println(ans);
    }
}
