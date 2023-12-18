import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputnum;

        while(true) {
            inputnum = sc.next();
            int ans = 0;

            if(inputnum.equals("0"))
                break;

            for(int i =0; i < inputnum.length(); i++) {
                ans += Character.getNumericValue(inputnum.charAt(i));
            }
            System.out.println(ans);
        }
    }
}
