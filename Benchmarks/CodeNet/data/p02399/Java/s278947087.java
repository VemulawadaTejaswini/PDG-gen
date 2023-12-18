import java.util.Scanner;
import java.math.BigDecimal;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String input1 = input.nextLine();
        String[] str = input1.split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = a/b;
        int d = a%b;
        BigDecimal bd = new BigDecimal(str[0]);
        BigDecimal bd1 = new BigDecimal(str[1]);
        BigDecimal divide = bd.divide(bd1, BigDecimal.ROUND_HALF_UP);
        System.out.println(c + " " + d + " " + divide);
    }
}
