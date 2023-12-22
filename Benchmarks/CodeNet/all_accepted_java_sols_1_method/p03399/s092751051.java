import java.io.PrintWriter;
        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;
        import java.util.Scanner;

public class Main {
    static private Scanner scan = new Scanner(System.in);
    public static void main(String args[]) {
        int int1 = Integer.parseInt(scan.next());
        int int2 = Integer.parseInt(scan.next());
        int int3 = Integer.parseInt(scan.next());
        int int4 = Integer.parseInt(scan.next());
        String ans = null;
        int ans_int = 0;
        if(int1 < int2){
            ans_int += int1;
        }else{
            ans_int += int2;
        }

        if(int3 < int4){
            ans_int += int3;
        }else{
            ans_int += int4;
        }
        PrintWriter out = new PrintWriter(System.out);
        out.println(ans_int);
        out.flush();
        scan.close();
    }
}
