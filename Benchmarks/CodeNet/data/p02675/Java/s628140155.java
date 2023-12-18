import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = String.valueOf(n);
        String target = s.substring(s.length()-1);
        String result = "pon";
        switch (target) {
            case "2":
            case "4":
            case "5":
            case "7":
            case "9":
            result = "hon";
                break;
            case "3":
            result = "bon";
                break;
            default:
            result = "pon";
                break;
        }
        
        System.out.println(String.valueOf(result));

    }
}