import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        String S = sc.next();
        char[] c = new char[N];
        for(int i = 0; i < S.length(); i++){
            c[i] = S.charAt(i);
        }
        c[A - 1] = 'A';
        c[B - 1] = 'B';
        // 遠くに行く方を先に動かす
        int bigTarget = C > D ? C - 1 : D - 1;
        int nowIndex = C > D ? A - 1 : B - 1;
        char player = C > D ? 'A' : 'B';
        char otherPlayer = C > D ? 'B' : 'A';
        int nowOtherIndex = C > D ? B - 1 : A - 1;
        int otherTarget = C > D ? D - 1 : C - 1;
        boolean result1 = true;
        while(nowIndex < bigTarget){
            if(c[nowIndex + 1] == '.'){
                c[nowIndex] = '.';
                c[nowIndex + 1] = player;
                nowIndex += 1;
            }else if(nowIndex + 2 <= bigTarget && c[nowIndex + 2] == '.'){
                c[nowIndex] = '.';
                c[nowIndex + 2] = player;
                nowIndex += 2;
            }else if(c[nowIndex + 1] == otherPlayer || c[nowIndex + 2] == otherPlayer){
                // 相手をずらす
                if(nowOtherIndex + 1 <= otherTarget && c[nowOtherIndex + 1] == '.'){
                    c[nowOtherIndex] = '.';
                    c[nowOtherIndex + 1] = otherPlayer;
                    nowOtherIndex += 1;
                }else if(nowOtherIndex + 2 <= otherTarget && c[nowOtherIndex + 2] == '.'){
                    c[nowOtherIndex] = '.';
                    c[nowOtherIndex + 2] = otherPlayer;
                    nowOtherIndex += 2;
                }else{
                    result1 = false;
                    break;
                }
            }else {
                result1 = false;
                break;
            }
        }
        boolean result2 = true;
        if(nowOtherIndex > otherTarget){
            result2 = false;
        }else{
            // 相手を動かす
            while(nowOtherIndex < otherTarget){
                if(c[nowOtherIndex + 1] == '.'){
                    nowOtherIndex += 1;
                }else if(nowOtherIndex + 2 <= otherTarget && c[nowOtherIndex + 2] == '.'){
                    nowOtherIndex += 2;
                }else{
                    result2 = false;
                    break;
                }
            }
        }
        if(result1 && result2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
