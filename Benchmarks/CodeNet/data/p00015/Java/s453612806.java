import java.math.BigInteger;
import java.util.Scanner;
    class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i =0;i < a;i++){
            BigInteger big = sc.nextBigInteger().add(sc.nextBigInteger());
            System.out.println(big.toString().length()>80?"overflow":big.toString());

        }
    }
}