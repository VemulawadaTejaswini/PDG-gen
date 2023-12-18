import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String r;
        switch(N % 10) {
            case 2: case 4: case 5: case 7: case 9:
                r = "hon";
                break;
            case 0: case 1: case 6: case 8:
                r = "pon";
                break;
            case 3:
                r = "bon";
                break;
            default:
                throw new Exception("out of thought");
        }
        System.out.println(r);
    }
}
