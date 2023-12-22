import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codeNum = sc.nextInt();
        int statusNum = sc.nextInt();
        int passScore = -sc.nextInt();

        int[] coefficient = new int[statusNum];
        for(int i  = 0; i < statusNum; i++)coefficient[i] = sc.nextInt();
        
        int ans = 0;
        for(int i = 0; i < codeNum; i++){
            int score = 0;
            for(int j  = 0; j < statusNum; j++){
                score += coefficient[j] * sc.nextInt();
            }
            if(score > passScore)ans++;
        }

        System.out.println(ans);
    }
}