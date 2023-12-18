import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(line);
        if (line.charAt(line.length() - 1) == 's') {
            sb.append("es");
        } else {
            sb.append("s");
        }

        System.out.println(sb.toString());
    }
}