import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int sum = 0;
        
        for (int i = 0; i < n.length(); i++) {
            String ni = String.valueOf(n.charAt(i));
            sum += Integer.parseInt(ni);
            if (sum % 9 == 0) {
                sum = 0;
            }
        }
        if (sum % 9 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
