import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        String inputStr = myObj.nextLine();
        char[] inputChar = inputStr.toCharArray();

        if (inputChar[2] == inputChar[3] && inputChar[4] == inputChar[5])
        {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}
