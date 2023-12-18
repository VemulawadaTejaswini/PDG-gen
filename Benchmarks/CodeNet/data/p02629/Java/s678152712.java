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
            //0を埋めてたら繰り下がり
            if(bits[top] == 0) {
                bits[top] = 26;
                n--;
            }
            top++;
        }

        //上の桁から出力
        for(int i = top - 1; i >= 0; i--) {
            System.out.print((char)('a' + bits[i] - 1));
        }
        System.out.println();
    }
}
