import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        
        String[] b = new String[n];
        for(int i=0;i<n;i++){
            b[i] = sc.next();
        }
        Arrays.sort(b);
        String tmp = "";
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(!tmp.equals(b[i])){
                cnt++;
                tmp = b[i];
            }
        }

        System.out.println(cnt);
    }
}
