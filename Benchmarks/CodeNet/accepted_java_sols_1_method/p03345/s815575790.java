import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        String k = sc.next();
        if(k.charAt(k.length()-1)=='1' || k.charAt(k.length()-1)=='3'|| k.charAt(k.length()-1)=='5' || k.charAt(k.length()-1)=='7' || k.charAt(k.length()-1)=='9') {
            System.out.println(b-a);
        } else {
            System.out.println(a-b);
        }
    }
}