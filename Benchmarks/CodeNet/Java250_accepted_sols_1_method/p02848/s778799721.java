import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // B - ROT N

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String s = sc.next();

        byte[] bs = s.getBytes();
        byte[] bp = new byte[bs.length];

        for (int i = 0; i < bs.length; i++) {
            bp[i] = (byte) (bs[i] + (byte)n);
            if (bp[i] > 90) bp[i] -= 26;
        }

//        System.out.println(Arrays.toString(bs));
//        System.out.println(Arrays.toString(bp));
        for (byte b : bp) {
            System.out.print((char)b);
        }
        System.out.println();
    }
}