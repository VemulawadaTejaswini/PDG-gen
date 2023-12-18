import java.io.PrintWriter;
        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;
        import java.util.Scanner;

public class Main {
    static private Scanner scan = new Scanner(System.in);
    public static void main(String args[]) {
//        int int1 = Integer.parseInt(scan.next());
        String str1 = scan.next();
        String str2 = scan.next();
        String str3 = scan.next();
        int ans_int = 0;


        PrintWriter out = new PrintWriter(System.out);
        out.println(str1.substring(0,1)+ str2.substring(1,2) + str3.substring(2,3));
        out.flush();
        scan.close();
    }
}
