import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String b = sc.next();
        String result;

        switch(b) {
            case "A":
                result = "T";
                break;
            case "T":
                result = "A";
                break;
            case "C":
                result = "G";
                break;
            case "G":
                result = "C";
                break;
            default:
                result = "";
                break;
        }

        System.out.println(result);
    }
}