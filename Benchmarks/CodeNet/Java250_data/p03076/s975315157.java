import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int ans = 0;
        int max = 0;
        for(int i = 0;i<5;i++){
            a[i] = sc.nextInt();
            sc.nextLine();
            
            ans += a[i] + 10 - a[i] % 10;
            if(a[i] % 10 != 0){
                max = Math.max(max,10 - a[i] % 10);
            }else{
                ans -=10;
            }
        }
        System.out.println(ans - max);
    }
}