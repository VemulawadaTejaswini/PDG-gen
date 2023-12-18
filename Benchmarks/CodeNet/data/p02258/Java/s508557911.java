import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // 初期値を仮で最小値に
        int minv = scan.nextInt();
        // 更新できるように最大値に十分小さい値を
        int maxv = Integer.MIN_VALUE;

        for(int i=1;i<n-1;i++){
           int in = scan.nextInt();
           // 最大値の更新
           if(maxv < in-minv){
               maxv = in-minv;
           }
           // 最小値の更新
           if(minv > in){
               minv = in;
           }
        }
        System.out.println(maxv);
    }
}