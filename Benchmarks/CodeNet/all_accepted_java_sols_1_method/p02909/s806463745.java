import java.util.*;
public class Main {
    public static final String[] W = new String[]{"Sunny", "Cloudy", "Rainy"};
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        for (int i = 0; i < W.length; i++) {
            if (s.equals(W[i])) {
                String output = (i < W.length - 1 )? W[i + 1] : W[0];
                System.out.println(output);
                break;
            }
        }
    }
}
