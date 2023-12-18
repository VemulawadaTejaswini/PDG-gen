import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int left = 0;
        int right = 0;
        for(int i = 0; i < m; i++){
            int tmp = sc.nextInt();
            if(tmp < x){
                left++;
            }else{
                right++;
            }
        }
        System.out.println(Math.min(left,right));
    }
}
