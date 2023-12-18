import java.math.*;
import java.util.*;
public class Main {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        if(s1.equals(s2.substring(0,s2.length()-1))==true)
            System.out.print("Yes");
        else{
            System.out.print("No");
        }
    }
   
}