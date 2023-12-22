import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int sum;
        while(true) {
            String s = sc.next();
            if(s.equals("-")) break;
            n = sc.nextInt();
            sum = 0;
            for (int i = 0; i < n; i++) {
                sum += sc.nextInt();
            }
            int p = sum % s.length();
            for (int i = 0; i < s.length(); i++) {
                System.out.print(s.charAt((p + i) % s.length()));
            }
            System.out.println();
        }
    }
}
