import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int a = Integer.parseInt(sc.next()) ;
        int b = Integer.parseInt(sc.next()) ;
        if(a>b) System.out.println("safe");
        else System.out.println("unsafe");
    }
}
