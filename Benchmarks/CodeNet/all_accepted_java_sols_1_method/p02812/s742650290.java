import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        String S = sc.next();
        int count = 0;

        for(int i=0; i<N; i++){
            if(i+2 == N){
                break;
            }
            if(S.charAt(i)=='A'){
                if(S.charAt(i+1)=='B'){
                    if(S.charAt(i+2)=='C'){
                        count++;
                    }
                    else{
                        continue;
                    }
                }
                else{
                    continue;
                }
            }else{
                continue;
            }
        }
        // 出力
        System.out.println(count);
    }
}