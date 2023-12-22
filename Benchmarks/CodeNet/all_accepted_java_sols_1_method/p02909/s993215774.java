import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String S = s.next();
        String answer = null;
        if (S.equals("Sunny")) {
            answer = "Cloudy";
        } else if (S.equals("Cloudy")) {
            answer = "Rainy";
        } else if (S.equals("Rainy")) {
            answer = "Sunny";
        }
        System.out.println(answer);
    }

}
