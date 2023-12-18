import java.util.*;
class Main{
    /*
     * 整数 -> nextInt() (遅い場合は下のni())
     * 単語 -> next()
     * 1行 -> nextLine()
     * 注意 : nextLIneをnext(),nextInt()のあとに呼び出す場合、次が改行だと改行だけ取ってしまうので注意
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();

        long v = x;
        int ans = 0;
        while(v <= y){
            v *= 2;
            ans++;
        }
        System.out.println(ans);
    }
}
