import java.util.Scanner;;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String num = sc.next();

        while (!num.equals("0")) {

            String[] strNum = new String[num.length()];
            int[] sepaNum = new int[num.length()];
            ;

            for (int i = 0; i < num.length(); i++) {
                strNum[i] = String.valueOf(num.charAt(i));
                sepaNum[i] = Integer.parseInt(strNum[i]);
            }

            int sum = 0;

            for (int i = 0; i < sepaNum.length; i++) {
                sum += sepaNum[i];
            }

            System.out.println(sum);

            num = sc.next();
        }

        sc.close();
    }
}

