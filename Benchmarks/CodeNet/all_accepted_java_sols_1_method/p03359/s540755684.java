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
        String ans = null;
        if(int1 > int2){
            ans = String.valueOf(int1-1);
        }else{
            ans = String.valueOf(int1);
        }
        if(int1 == int2 && int2 == 1){
            ans = String.valueOf(1);
        }
        PrintWriter out = new PrintWriter(System.out);
        out.println(ans);
        out.flush();
        scan.close();
    }
}
