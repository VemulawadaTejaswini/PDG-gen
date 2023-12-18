import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    static private Scanner scan = new Scanner(System.in);
    public static void main(String args[]) {
//        int int1 = Integer.parseInt(scan.next());
//        int int2 = Integer.parseInt(scan.next());
//        int int3 = Integer.parseInt(scan.next());
//        int int4 = Integer.parseInt(scan.next());
        int ans_int = 0;
        String ans = "";
//        String temp_str1 = "";
//        String temp_str2 = "";
        int temp_int1 = 0;
        String str1 = scan.next();
//        String str2 = scan.next();
//        String str3 = scan.next();
        double ans_dob = 0;
        if(str1.equals("Sunny")){
            ans = "Cloudy";
        }else if(str1.equals("Cloudy")){
            ans = "Rainy";
        }else{
            ans = "Sunny";
        }
        PrintWriter out = new PrintWriter(System.out);
        out.println(ans);
        out.flush();
        scan.close();
    }
}
