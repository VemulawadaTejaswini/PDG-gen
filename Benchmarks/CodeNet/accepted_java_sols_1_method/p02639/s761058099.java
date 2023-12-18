import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        var scaner = new Scanner(System.in);
        
        var ans = 0;

        for (int i = 1; i < 6; i++) {
            var input = scaner.nextInt();
            if (input == 0) {
                ans = i;
            }
        }

        System.out.println(ans);

        scaner.close();
    }

}
