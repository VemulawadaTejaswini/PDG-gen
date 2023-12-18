import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        String result;
        if(c > b && b > a) {
            result = "Yes";
        } else {
            result = "No";
        }

        System.out.println(result);
    }

}