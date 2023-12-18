import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        long numR = 0;
        long numG = 0;
        long numB = 0;
        long ans = 0;
        for(int i=0;i<N;i++){
            char c = S.charAt(i);
            if(c=='R'){
                numR++;
            }else if(c=='G'){
                numG++;
            }else{
                numB++;
            }
        }
        // 組み合わせの数を計算
        ans = numR*numG*numB;
        for(int a=1;a<N;a++){
            for(int sa = 1;a+sa*2<=N;sa++){
                if(S.charAt(a-1) != S.charAt(a+sa-1) && S.charAt(a-1) != S.charAt(a+sa*2-1) && S.charAt(a+sa-1) != S.charAt(a+sa*2-1)){
                    ans--;
                }
            }
        }
        System.out.println(ans);
    }
}