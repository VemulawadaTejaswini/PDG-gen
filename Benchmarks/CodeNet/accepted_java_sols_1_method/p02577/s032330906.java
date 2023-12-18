import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();

        long sum = 0;
        for (int i = 0; i < N.length(); i++) {
//            System.out.println((int) N.charAt(i) - 48);
            sum += (int) N.charAt(i) - 48;
        }

//        if (sum == 0){
//            System.out.println("No");
//        } else
        if (sum % 9 == 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
