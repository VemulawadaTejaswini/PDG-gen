import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String sb = str;
        String sNum1 = sb.substring(0, 2);
        String sNum2 = sb.substring(2);
        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);

        //System.out.println(num1 + ":" + num2);

        if (0 < num1 && 0 < num2 && num1 <= 12 && num2 <= 12) {
            System.out.println("AMBIGUOUS");
        } else if (0 < num1 && num1 <= 12) {
            System.out.println("MMYY");
        } else if (0 < num2 && num2 <= 12) {
            System.out.println("YYMM");
        } else {
            System.out.println("NA");
        }
        
    }
}