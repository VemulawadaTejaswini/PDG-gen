import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        System.out.println("数値を２つ入力してください。");
        String str1 = in.next();
        String str2 = in.next();
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        int x = a * b;
        int y = ( a + b ) * 2;
        System.out.println(x+" "+y);
    }
}