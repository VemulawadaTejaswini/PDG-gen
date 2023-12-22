
import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),k = obj.nextInt();
        String s =  Integer.toUnsignedString(n,k);
        System.out.println(s.length());
    }
}
