import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int[] bits = new int[12]; //26進数を記録
        int top = 0; //26進表記何桁か
        
        //26進数に変換
        while(n > 0) {
            bits[top] = (int)(n % 26);
            n /= 26;
            top++;
        }

        //下から1以上になるように補正
        for(int i = 0; i < top - 1; i++) {
            if(bits[i] <= 0) {
                bits[i] += 26;
                bits[i + 1]--;
            }
        }
        //最上位の桁(bits[top - 1])が0に繰り下がった場合、topを１減らす
        if(bits[top - 1] == 0) top--;

        //上の桁から出力
        for(int i = top - 1; i >= 0; i--) {
            System.out.print((char)('a' + bits[i] - 1));
        }
        System.out.println();
    }
}
