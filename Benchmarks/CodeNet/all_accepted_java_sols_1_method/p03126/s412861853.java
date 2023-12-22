import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] like = new int[m+1];
        int ans = 0;
        for(int i = 0;i < n;i++){
            int kind = sc.nextInt();
            for(int j = 0;j < kind;j++){
                like[sc.nextInt()]++;
            }
        }

        for(int i : like){
            if(i == n)
            ans++;
        }

        System.out.println(ans);
    }
}