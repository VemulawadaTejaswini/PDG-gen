import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        long t = a + b;


        long syou = n/t;
        //System.out.println(syou);

        long amari = n%t;
        //System.out.println(amari);

        long nokori = a;
        // 7  1
        if(amari < a){
            nokori = amari;
        }
        long ans = a*syou + nokori;
        System.out.println(ans);

    }

}