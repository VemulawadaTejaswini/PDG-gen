import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input
        String  S = sc.next();

        //replace all 2017 to 2018
        String editedS = S.replace("2017", "2018");

        System.out.println(editedS);
    }

}