import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputnum;

        while(true) {
            inputnum = sc.nextInt();
            int ans = 0;

            if(inputnum == 0)
                break;

            while(inputnum != 0) {
                ans += inputnum % 10;
                inputnum -= inputnum % 10;
                if(inputnum == 0)
                    break;
                inputnum = inputnum / 10;
            }

            System.out.println(ans);
        }
    }
}
