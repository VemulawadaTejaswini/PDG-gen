import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        while(true) {
            String x = stdIn.next();
            if(x.equals("0"))
                break;
            int sum = 0;
            for(int i = 0; i < x.length(); i++) {
                // sum += Character.digit(x.charAt(i), 10);
                sum += x.charAt(i) - '0';
            }
            System.out.println(sum);
        }
    }
}
