import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int n = sc.nextInt();
        long S[] = new long[n];
        for(int i = 0 ; i < n ; i++)
            S[i] = sc.nextLong();
        int q = sc.nextInt();
        long T[] = new long[q];
        for(int i = 0 ; i < q ; i++)
            T[i] = sc.nextLong();
        for(int i = 0 ; i < q ; i++){
            int start = 0;
            int end = n-1;
            while(true){
                if(S[start] == T[i] || S[end] == T[i]){
                    cnt++;
                    break;
                }
                int c = (start + end) / 2;
                if(S[c] == T[i]){
                     cnt++;
                     break;
                }
                else if(S[c] < T[i])
                    start = c;
                else
                    end = c;
                if(end - start == 1)
                    break;
            }
        }
        System.out.println(cnt);
    }
}
