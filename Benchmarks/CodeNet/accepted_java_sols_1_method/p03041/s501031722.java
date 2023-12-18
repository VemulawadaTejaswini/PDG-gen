import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int con = Integer.parseInt(in.nextLine().split(" ")[1]) - 1;
        String str = in.nextLine();
        in.close();
        char c = (char) (str.charAt(con) + 32);
        String ans = str.substring(0, con) + String.valueOf(c) + str.substring(con + 1);
        System.out.println(ans);
    }
}