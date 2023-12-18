import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
        int n = sc.nextInt();
        int s = sc.nextInt();
        if(n == 0 && s == 0) break;
        int a[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int ans = 0;
        for(int i = 0; i<(Math.pow(2,10)); i++){
            int sum = 0;
            int time = 0;
            for(int j=0; j<10; j++){
                if((1&i>>j) == 1) {
                    sum += a[j];
                    time++;
                }
            }
            if(sum == s && time == n) ans++;
        }
        System.out.println(ans);

        }
        sc.close();
    }
}
