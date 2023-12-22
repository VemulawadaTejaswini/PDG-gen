import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String one = "1";
        int output=0;

        String[] sr = s.split("");

        if(sr[0].equals(one))
        {
            output++;
        }
        if(sr[1].equals(one))
        {
            output++;
        }
        if(sr[2].equals(one))
        {
            output++;
        }
        System.out.println(output);
    }
}