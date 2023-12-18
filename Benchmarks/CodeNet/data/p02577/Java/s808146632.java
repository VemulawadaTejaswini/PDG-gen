import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        if(num == "0") {
            System.out.println("No");
        }
        else {
            long sum = 0;
            for(int i = 0; i < num.length(); i++) {
                char ch = num.charAt(i);
                sum += Integer.parseInt(String.valueOf(ch));
            }
            if (sum % 9 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
