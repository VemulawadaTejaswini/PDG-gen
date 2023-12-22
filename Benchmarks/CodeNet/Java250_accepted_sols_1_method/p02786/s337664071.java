import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long H = Long.parseLong(s.next());

        // int n = (int) (Math.log(H) / Math.log(2));
        // System.out.println(n);
        // System.out.println("i:"+i+", bits: "+setBits(i));
        // 2分木の要素数を出してしまえば終わり
        System.out.println(2*Long.highestOneBit(H)-1);
        // System.out.println((long) Math.pow(2, n) * 2 - 1);
    }

}
