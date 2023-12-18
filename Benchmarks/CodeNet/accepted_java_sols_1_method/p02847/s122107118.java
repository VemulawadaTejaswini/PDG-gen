import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String day = s.next();
        int answer = 0;

        switch (day) {
        case "MON":
            answer = 6;
            break;
        case "TUE":
            answer = 5;
            break;
        case "WED":
            answer = 4;
            break;
        case "THU":
            answer = 3;
            break;
        case "FRI":
            answer = 2;
            break;
        case "SAT":
            answer = 1;
            break;
        case "SUN":
            answer = 7;
            break;
        }

        System.out.println(answer);
    }
}
