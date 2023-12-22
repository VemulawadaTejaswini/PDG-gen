import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, s, ans = 0;
 
        for(;;){
            n = sc.nextInt();
            s = sc.nextInt();
            if(n == 0 && s == 0) break;
            for(int i = 1; i < n; i++){
                for(int x = i+1; x < n; x++){
                    for(int y = x+1; y <= n; y++){
                        if(i+x+y==s) ans+=1;
                    }
                }
            }
            System.out.println(ans);
            ans = 0;
        }
    }
}