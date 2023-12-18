import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        boolean check = false;
        String answer = "";
        for(int i = 0; i <= n ; i++) {
            for(int j = 0; j <= n - i; j++) {
                if((i*10000 + j*5000 + (n - i - j)*1000) == y) {
                    answer = i + " " + j + " " + (n - i - j);
                    check = true;
                }
            }
        }
        if(check) {
            System.out.println(answer);
        } else {
            System.out.println("-1 -1 -1");
        }
    }
}