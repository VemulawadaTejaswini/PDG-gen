import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        if(s.length()>=4 && s.substring(0,4).equals("YAKI"))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}