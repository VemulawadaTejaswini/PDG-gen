import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.util.Scanner;

public class Main {
    public static void main(String []args)
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
     /*   if(str.equals("2019/04/30"))
            System.out.println("Heisei");
        else
            System.out.println("TBD");*/
        int y = 2019;
        int m = 4;
        int d = 30;
        String words[]=str.split("/");
        int year  = Integer.valueOf(words[0]);
        int month = Integer.valueOf(words[1]);
        int day   = Integer.valueOf(words[2]);

            if(year<=y && month<=m && day <=d)
                System.out.println("Heisei");
            else
                System.out.println("TBD");

    }
}
