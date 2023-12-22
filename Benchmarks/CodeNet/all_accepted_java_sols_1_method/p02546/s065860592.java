import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        if(next.charAt(next.length() - 1) == 's'){
            System.out.println(next + "es");
        }else {
            System.out.println(next + "s");
        }
    }
}
