import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int S = a*b;
        int L = 2*(a+b);
        System.out.println(S+" "+L);
    }
}