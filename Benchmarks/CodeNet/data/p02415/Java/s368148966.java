import java.util.Scanner;

public class Main {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        sc.close();
        char[] w = new char[str.length()];

        for (int i = 0; i < str.length(); i++)
        {
            w[i] = str.charAt(i);
            if ('a' <= w[i] && w[i] <= 'z') w[i] -= 32;
            else if ('A' <= w[i] && w[i] <= 'Z') w[i] += 32;
        }
        str = new String(w);

        System.out.println(str);
    }
}
