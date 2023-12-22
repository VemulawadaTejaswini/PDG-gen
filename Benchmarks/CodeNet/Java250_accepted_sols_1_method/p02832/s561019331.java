import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        int ans = 0;
        int x = 1;
        for(int i = 0; i < n; i++){
            int a = Integer.parseInt(sc.next());
            if(a == x){
                x++;
            }else{
                ans++;
            }
        }
        if(x == 1) ans = -1;
        
        System.out.println(ans);
    }
}