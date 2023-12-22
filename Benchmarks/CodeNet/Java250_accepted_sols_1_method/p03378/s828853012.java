import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                   //マスの長さ0~nマスあるからn+1マスある
        int m = sc.nextInt();                   //料金所の個数
        int x = sc.nextInt();                   //現在地1~n-1
        List<Integer> cost = new ArrayList<>(); //料金所の位置
        int left = 0;                           //xより左にある料金所の数
        int right = 0;                          //xより右にある料金所の数

        //input
        for(int i = 0;i < m;i++){
            int num = sc.nextInt();
            cost.add(num);
        }

        for(int i = 1;i <= n;i++){
            int index = 0;
            if(i < x && cost.contains(i)){
                left++;
                index++;
            }else if(i > x && cost.contains(i)){
                right++;
                index++;
            }
        }
        System.out.println(Math.min(left,right));
    }
}