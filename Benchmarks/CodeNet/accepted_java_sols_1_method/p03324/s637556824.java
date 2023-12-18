import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();
        if(n == 100){
            System.out.println(101 * (int)Math.pow(100,d));
        }
        else System.out.println(n * (int)Math.pow(100,d));
    }


}
