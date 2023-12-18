import java.util.*;

public class Main{
    public static void main(String[] args){
      	final int A = 1000005;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //与えられる整数を格納する配列
      	int a[] = new int [n];
        //与えられた整数iの個数を数える配列cを用意し、c[i]に格納する
        int c[] = new int [A];
        int b;
        String ans = "pairwise coprime";
        for(int i = 0; i < A; i++){
            c[i] = 0;
        }
        for(int i = 0; i < n; i++){
            b = sc.nextInt();
            c[b] += 1;
        }

        //配列cを使って公約数を調べる。
        //iの倍数である数がいくつあるかを数える。cnt==n であればnot coprime
        //n > cnt > 1ならばsetwise coprime
        for(int i = 2; i < A; i++){
            int cnt = 0;
            for(int j = i; j < A; j += i){
                cnt += c[j];
            }
            if(cnt == n){
                ans = "not coprime";
                break;
            }else if(cnt > 1){
                ans = "setwise coprime";
            }
        }
        
        System.out.println(ans);
    }
}
