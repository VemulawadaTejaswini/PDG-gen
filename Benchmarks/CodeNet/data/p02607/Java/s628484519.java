
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for(int i=0;i<n;i++){
            if(i%2!=0){
                sc.nextInt();
                continue;
            }
            if(sc.nextInt() % 2 != 0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
