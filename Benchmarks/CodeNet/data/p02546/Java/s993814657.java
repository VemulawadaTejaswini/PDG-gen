import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String x = "";

        if(S.charAt(S.length() - 1) != 's') {
            x = S.append("s");
        } else {
            x = S.append("es");
        }
        System.out.print(x);
    }
}

