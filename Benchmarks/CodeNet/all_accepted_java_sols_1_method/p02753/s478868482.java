import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner cin = new Scanner(System.in);
        String S = cin.nextLine();

        if(S.equals("AAA" )|| S.equals("BBB"))
            System.out.println("No");
        else
            System.out.println("Yes");


        cin.close();
    }
}