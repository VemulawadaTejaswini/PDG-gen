import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(),b = s.nextInt();
        String c;
        if (a>b) {
            c=">";
        } else if (a<b) {
            c="<";
        } else {
            c="==";
        }
        System.out.println("a "+c+" b");
    }
}