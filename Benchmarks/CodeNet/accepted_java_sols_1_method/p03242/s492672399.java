import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println( s.replace('9', '0').replace('1', '9').replace('0', '1') );
    }
}
