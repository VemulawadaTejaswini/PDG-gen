import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = 0;

        for(int i=1; i<=N; i++){
            String s = String.valueOf(i);
            int l = s.length();
            int sum = 0;
            for(int j=0; j<l; j++){
                sum += Integer.parseInt(s.substring(j, j+1));
            }
            if(sum>=A && sum<=B){
                ans += i;
            }
        }
        System.out.println(ans);
    } 
}