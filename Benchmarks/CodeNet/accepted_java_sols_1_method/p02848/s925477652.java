import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        String s = sc.next();

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result = "";
        for (String c : s.split("")) {
            int index = alphabet.indexOf(c) + n;
            result += alphabet.charAt(index);
        }
        
        System.out.println(result);
        sc.close();
    }
}
