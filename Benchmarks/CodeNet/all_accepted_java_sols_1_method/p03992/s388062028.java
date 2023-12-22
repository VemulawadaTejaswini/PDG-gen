import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String pre = s.substring(0,4);
        String post = s.substring(4);
        System.out.println(pre + " " + post);
    }

 }