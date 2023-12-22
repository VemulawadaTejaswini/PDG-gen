import java.util.Scanner;
public class Main{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        String x = sc.next();
        int y = x.length();
            if (x.equals("0")) {
                break;
            } else {
                int sum = 0;
                for (int i = 0; i < y; i++) {
                    char c = x.charAt(i);
                    int n = c - '0';
                    sum = sum + n;
                }
                System.out.println(sum);
            }
        }
    }
}

