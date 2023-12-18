import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner out = new Scanner(System.in);
        Integer a =out.nextInt();
        System.out.println(a/3600+":"+a%3600/60+":"+a%3600%60);

    }
}