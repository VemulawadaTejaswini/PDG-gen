import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();
        String ans;

        StringBuilder sb = new StringBuilder(N);
        for(int i = 0; i < N; i++){
            if(i == K - 1){
                sb.append(S.substring(i, i + 1).toLowerCase());
            }else{
                sb.append(S.substring(i, i + 1));
            }
        }
        ans = sb.toString();
        System.out.println(ans);
    }
}