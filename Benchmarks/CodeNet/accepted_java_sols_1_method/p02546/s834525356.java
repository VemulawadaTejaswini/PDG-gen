import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(S);
        if(S.charAt(S.length() - 1) != 's') {
            sb.append("s");
        } else {
            sb.append("es");
        }
        System.out.print(new String(sb));
    }
}

