import java.util.Scanner;

public class Solution {

    public static void main(String[] args)
    {
        Scanner ab = new Scanner(System.in);

        String arr = ab.next();
        
        for (int i = arr.length() - 1; i >= 0 ; i--)
        {
            char arr2 = arr.charAt(i);
            
            System.out.print(arr2);
        }
        
        System.out.println();
    }

}