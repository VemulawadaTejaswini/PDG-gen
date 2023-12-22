import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String number = scan.nextLine();
            int num = 0;
            if (number.equals("0")) {
                break;
            }
            for(int i = 0; i < number.length(); i++) {
                char ch = number.charAt(i);
                num += Character.getNumericValue(ch);
            }
                System.out.println(num);
        }
    }
}