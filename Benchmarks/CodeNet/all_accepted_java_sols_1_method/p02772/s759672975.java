import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        int cnt1 = 0;
        for(int i = 0;i < N;i++){
            int a = sc.nextInt();
            if(a % 2 == 0){
                cnt++;
                if(a % 3 == 0 || a % 5 == 0){
                    cnt1++;
                }
            }
        }
        if(cnt == cnt1){
            System.out.println("APPROVED");
        }else{
            System.out.println("DENIED");
        }
    }
}
