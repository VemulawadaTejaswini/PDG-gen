import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner inputs = new Scanner(System.in);
        String n = inputs.next();
        int sum = 0;
        for(char ch: n.toCharArray())
            sum += Character.getNumericValue(ch);

        if(sum%9 == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}