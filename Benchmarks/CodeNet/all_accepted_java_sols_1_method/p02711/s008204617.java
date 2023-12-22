import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);

        num = scan.nextInt();

        String num_s = String.valueOf(num);

        boolean bool = false;
        for(int i = 0; i < 3; i++) {
            String s = num_s.substring(i, i+1);
            if(s.equals("7")) {
                bool = true;
                break;
            }
        }

        if(bool) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}