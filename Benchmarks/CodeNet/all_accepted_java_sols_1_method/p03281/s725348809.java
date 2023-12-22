import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int ans = 0;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j+=2){
                if(i%j == 0){
                    count++;
                }
                if(count == 8){
                    ans++;
                }
                if(count == 9){
                    ans--;
                    break;
                }
            }
            count = 0;
        }
        System.out.println(ans);
    }
}