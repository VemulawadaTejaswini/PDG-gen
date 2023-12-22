import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String S = scn.nextLine();

        System.out.println(S.substring(0,3));

        scn.close();
    }

}