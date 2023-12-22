import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String S = s.nextLine();
        if(S.substring(2,3).equals(S.substring(3,4)) && S.substring(4,5).equals(S.substring(5,6)))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
