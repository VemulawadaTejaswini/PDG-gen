import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        var scaner = new Scanner(System.in);

        var x = scaner.nextInt();
        var y = scaner.nextInt();

        var ans = "No";
        for (int i = 1; i <= x; i++) {
            if ((i*2) + (x-i)*4 == y ) {
                ans = "Yes";
                break;
            }
        }

        System.out.println(ans);

        scaner.close();
    }

}