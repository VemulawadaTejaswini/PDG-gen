import java.util.Scanner;

public class Main {


    public static void main(String args[]){

        Scanner src = new Scanner(System.in);

        int a = src.nextInt();
        int b = src.nextInt();
        int c = src.nextInt();
        int d  = src.nextInt();

        long max = (long)a*(long)c;

        max = Math.max((long)b*(long)d,max);
        max = Math.max((long)a*(long)d,max);
        max = Math.max((long)b*(long)c,max);

        System.out.println(max);

    }
}
