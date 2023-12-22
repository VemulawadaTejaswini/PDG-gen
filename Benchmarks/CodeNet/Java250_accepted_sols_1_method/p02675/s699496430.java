import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next()) % 10;
        String reuslt;
        switch (num) {
            case 2:
            case 4:
            case 5:
            case 7:
            case 9:
                reuslt = "hon";
                break;
            case 0:
            case 1:
            case 6:
            case 8:
                reuslt = "pon";
                break;
            case 3:
                reuslt = "bon";
                break;
            default:
                throw new IllegalArgumentException();
        }

        System.out.println(reuslt);
    }
}