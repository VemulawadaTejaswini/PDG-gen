import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       String str=sc.nextLine();
        BigInteger bg =new BigInteger(str);
        BigInteger nine=new BigInteger("9");
        BigInteger reminder=bg.remainder(nine);
        BigInteger y=new BigInteger("0");
        if(reminder.compareTo(y)==0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
