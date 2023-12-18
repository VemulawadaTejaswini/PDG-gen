import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        String answer = "APPROVED";
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.next());
            if(num % 2 != 0) {
                continue;
            } else {
                if (num % 3 != 0 && num % 5 != 0) {
                    answer = "DENIED";
                    System.out.println(answer);
                    break;
                } else {
                    continue;
                }
            }
        }
        if("APPROVED".equals(answer)) {
            System.out.println(answer);
        }
    }
}