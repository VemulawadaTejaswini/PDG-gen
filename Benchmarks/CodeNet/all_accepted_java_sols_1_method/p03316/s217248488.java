import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        int sn = 0;
        for (char c : n.toCharArray()) {
            sn += c - '0';
        }

        System.out.println(Integer.parseInt(n)%sn == 0 ? "Yes" : "No");
    }
}
