import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String out;
        switch(n % 10){
            case 3:
                out = "bon";
                break;
            case 0:
                out = "pon";
                break;
            case 1:
                out = "pon";
                break;
            case 6:
                out = "pon";
                break;
            case 8:
                out = "pon";
                break;
            default:
                out = "hon";
                break;
        }
        System.out.println(out);
        scan.close();
    }
}