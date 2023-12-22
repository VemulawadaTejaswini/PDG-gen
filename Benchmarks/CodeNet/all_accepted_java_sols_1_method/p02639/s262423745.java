import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        for(int i = 1; i <= 5; i++){
            int pre = sc.nextInt();
            if(pre == 0){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
