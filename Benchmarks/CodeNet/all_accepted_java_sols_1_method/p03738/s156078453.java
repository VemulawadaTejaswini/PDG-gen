import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[][] map;
    static int[][] label;


    static ArrayList<String> list;

    static int M;
    static int N;
    static int T;
    static int P;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        BigInteger aa = new BigInteger(a);
        BigInteger bb = new BigInteger(b);

        if(aa.compareTo(bb) == 1){
            System.out.println("GREATER");
        }else if(aa.compareTo(bb) == -1){
            System.out.println("LESS");
        }else{
            System.out.println("EQUAL");
        }

    }



}
