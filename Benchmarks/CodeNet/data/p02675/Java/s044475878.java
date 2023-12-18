import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        int nSubInt = Integer.parseInt(n.substring(n.length() - 1));

        String ans = new String();

        switch (nSubInt) {
            case 2:
            case 4:
            case 5:
            case 7:
            case 9:
                ans = "hon";
                break;
            case 0:
            case 1:
            case 6:
            case 8:
                ans = "pon";
                break;
            case 3:
                ans = "bon";
            default:
                break;
        }

        System.out.println(ans);
    }
}
