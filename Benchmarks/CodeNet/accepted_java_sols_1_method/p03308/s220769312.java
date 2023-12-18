import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int An[] = new int[N];
        int ans=0;
        //Anに値を取り込む
        for (int i = 0; i < N; i++) {
            An[i] = s.nextInt();
        }
        Arrays.sort(An);
        ans=An[N-1]-An[0];
        //ansを出力する
        System.out.print(ans);
    }
}
