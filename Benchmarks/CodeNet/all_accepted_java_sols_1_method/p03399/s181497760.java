import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();
        System.out.println(Math.min(n, m) + Math.min(h, w));
    }

}
