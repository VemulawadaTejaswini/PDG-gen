import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();
        sc.close();

        StringBuilder sb = new StringBuilder();

        for(long i = 0; i < val.length(); i++){
            sb.append("x");
        }
        System.out.println(sb.toString());
    }
}