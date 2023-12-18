import java.util.Scanner;
public class Main {
    public static void main(String[] aargs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = n - n / 1000 * 1000;
        if(p != 0){
            p = 1000 - p;
        }
        sc.close();
        System.out.println(p);
    }
}