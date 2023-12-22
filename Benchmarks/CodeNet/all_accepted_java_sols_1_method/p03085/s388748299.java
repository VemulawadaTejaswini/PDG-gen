import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String answer = "";
        switch (str) {
            case "A":
                answer = "T";
                break;
            case "T":
                answer = "A";
                break;
            case "C":
                answer = "G";
                break;
            case "G":
                answer = "C";
                break;
        }
        
        System.out.println(answer);
    }
}