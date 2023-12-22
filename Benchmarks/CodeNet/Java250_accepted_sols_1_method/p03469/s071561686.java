import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        
        System.out.print("2018/01/");
        System.out.print(N.charAt(8));
        System.out.println(N.charAt(9));
        
    }
}