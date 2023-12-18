import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(calc(a));
    }

    public static int calc(int a){
        return a + a*a + a*a*a;
    }
}
