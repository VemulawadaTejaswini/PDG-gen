import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    static private Scanner scan = new Scanner(System.in);
    public static void main(String args[]) {
        int int1 = Integer.parseInt(scan.next());
        int int2 = Integer.parseInt(scan.next());
//        int int3 = Integer.parseInt(scan.next());
//        String temp_str1 = "";
//        String temp_str2 = "";
        int temp_int1 = 0;
//        String str1 = scan.next();
        int ans_int = 0;
        String ans = "";
//        double ans_dob = 0;
        if(int1 > int2 && int2 !=1){
            ans = "Alice";
        }else if(int2 > int1 && int1 !=1){
            ans = "Bob";
        }else{
            ans = "Draw";
        }

        if(int1 == 1 && int2 !=1){
            ans = "Alice";
        }else if(int2 == 1 && int1 !=1){
            ans = "Bob";
        }


        PrintWriter out = new PrintWriter(System.out);
        out.println(ans);
        out.flush();
        scan.close();
    }
}
