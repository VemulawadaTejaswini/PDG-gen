import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String X = scan.next();
        scan.close();
        int divizer = 0;
        for (int i = 0; i < X.length(); i++) {
            char c = X.charAt(i);
            divizer += Integer.parseInt(String.valueOf(c));
        }
        System.out.println(Integer.parseInt(X) % divizer == 0 ? "Yes" : "No");
    }
}
