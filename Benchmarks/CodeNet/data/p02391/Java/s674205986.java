import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        String result;
        if(a > b) {
            result = "a > b";
        } else if(a < b) {
            result = "a < b";
        } else {
            result = "a == b";
        }

        System.out.println(result);
    }

}