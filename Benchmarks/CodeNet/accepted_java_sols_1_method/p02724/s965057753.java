import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();

        long n = x/500;

        //System.out.println("n:" + n);

        long amari = x - (500*n);

        long m = amari/5;

        //System.out.println("m:" + m);


        System.out.println(n*1000 + m*5);



    }

}