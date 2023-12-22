import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int nagasa = sc.next().toString().length();
        for (int i = 0; i < nagasa; i++) {
            sb.append("x");
        }
        System.out.println(sb);
    }
}
