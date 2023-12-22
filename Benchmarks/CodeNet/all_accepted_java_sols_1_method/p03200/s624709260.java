import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        int len = S.length;
        long ans = 0;
        long bCnt = 0;
        for(int i = 0; i < len; i++){
            if(S[i] == 'B'){
                ans += len -1 -i;
                bCnt++;
            }
        }
        bCnt--;
        ans -= (1+bCnt)*bCnt/2;
        System.out.println(ans);

        sc.close();
    }

}
