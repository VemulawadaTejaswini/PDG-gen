import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        double ans = a + Math.pow(a,2) + Math.pow(a,3);
        System.out.println((int)ans);
    }
}
