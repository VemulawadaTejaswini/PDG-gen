import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        //input
        Scanner sc = new Scanner(System.in);
        char[] n = sc.next().toCharArray();
        System.out.println((char)(n[0]+1));
    }
}