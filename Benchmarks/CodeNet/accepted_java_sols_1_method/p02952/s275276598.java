import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        for(int i = 1;i <= N;i++){
            if(String.valueOf(i).length() % 2 != 0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
