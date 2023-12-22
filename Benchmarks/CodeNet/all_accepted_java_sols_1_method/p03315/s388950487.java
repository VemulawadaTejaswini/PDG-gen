import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        int answer = 0;
        answer += n.charAt(0) == '+' ? 1 : -1 ;
        answer += n.charAt(1) == '+' ? 1 : -1 ;
        answer += n.charAt(2) == '+' ? 1 : -1 ;
        answer += n.charAt(3) == '+' ? 1 : -1 ;
        System.out.println(answer);
    }
}
