import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String c = stdIn.next();
        String strSet = "abcdefghijklmnopqrstuvwxyz";

        int n = strSet.indexOf(c);
        System.out.println(strSet.charAt(n + 1));
    }
}