import java.io.BufferedInputStream;
import java.math.BigDecimal;
import java.util.Scanner;
public class Test
{

    public static String turn(String str)
    {
        StringBuffer sb = new StringBuffer();
        for (int i = str.length() - 1; i >= 0; i--)
        {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args)
    {
        String str = "123456789";
        System.out.println(Test.turn(str));
    }

}