import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        String t = sc.next();
        int N = s.length();
        int M = t.length();
        char[] S = new char[N];
        char[] T = new char[M];
        
        for(int i = 0; i < N; i++) S[i] = s.charAt(i);
        for(int i = 0; i < M; i++) T[i] = t.charAt(i);
        
        //辞書順に文字列を並び替え
        Arrays.sort(S);
        Arrays.sort(T);
        
        //文字数の少ない数だけfor文をループ
        int loop = 0;
        if(N <= M){
            loop = N; 
        }else{
            loop = M;
        }
        
        //S[]の先頭とT[]の後方から文字列を比較
        for(int i = 0; i < loop; i++){
            if(S[i] < T[(M - 1) - i]){
                System.out.println("Yes");
                return;
            }else if(S[i] > T[i]){
                System.out.println("No");
                return;
            }else{
                continue;   
            }
        }
        //文字列が一緒のとき、文字数で比較
        System.out.println(N < M ? "Yes" : "No");
    }
}
