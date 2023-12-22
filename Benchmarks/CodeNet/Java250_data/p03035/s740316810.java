import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    static private Scanner scan = new Scanner(System.in);
    public static void main(String args[]) {
        int int1 = Integer.parseInt(scan.next());
        int int2 = Integer.parseInt(scan.next());

//        String str1 = scan.next();
//        int int3 = Integer.parseInt(scan.next());
//        String str1 = scan.next();

        int ans_int = 0;
        double ans_dob = 0;
        String ans = "";

        if(int1 >= 6){
            if(int1 <= 12){
                ans_int = int2/2;
            }else{
                ans_int = int2;
            }
            //        StringBuilder sb = new StringBuilder(str1);
        }else{
            ans_int = 0;
        }

//        sb.replace(0,4,"2018");
        PrintWriter out = new PrintWriter(System.out);
        out.println(ans_int);
        out.flush();
        scan.close();
    }
}
