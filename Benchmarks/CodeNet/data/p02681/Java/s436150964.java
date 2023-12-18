import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s2 = sc.next();

        if(s.equals(s2.substring(0,s2.length()-1))&&(s2.length()==s.length()+1))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}