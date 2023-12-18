import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    static private Scanner scan = new Scanner(System.in);
    public static void main(String args[]) {
//        int int1 = Integer.parseInt(scan.next());
//        int int2 = Integer.parseInt(scan.next());
//        int int3 = Integer.parseInt(scan.next());
//        int int4 = Integer.parseInt(scan.next());
        double db = Double.parseDouble(scan.next());
        int ans_int = 0;
        String ans = "";
//        String temp_str1 = "";
//        String temp_str2 = "";
        int temp_int1 = 0;
//        String str1 = scan.next();
//        String str2 = scan.next();
//        String str3 = scan.next();

        double ans_dob = 0;
        if(db % 2 == 0){
            ans_dob= (db/2)/db;
        }else{
            ans_dob = (db/2+0.5)/db;
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(ans_dob);
        out.flush();
        scan.close();
    }
}
