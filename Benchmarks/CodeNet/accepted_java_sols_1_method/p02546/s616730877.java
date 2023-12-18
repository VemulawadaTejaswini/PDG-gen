import java.util.*;

public class Main
{

    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        String inp = kb.nextLine();

        inp.trim();

        if(inp.charAt(inp.length() - 1) == 's')
            System.out.println(inp + "es");
        else
            System.out.println(inp + "s");

    }
}