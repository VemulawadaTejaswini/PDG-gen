import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int a = Integer.parseInt(scan.next());
        String strans = "";
        int intans = 0;

        int odd = 0;
        int eve = 0;
            if(a<1200){
                strans = "ABC";
            }else if(a<2800){
                strans = "ARC";
            }else{
                strans = "AGC";
            }
        PrintWriter out = new PrintWriter(System.out);
        out.println(strans);
        out.flush();
        scan.close();
    }
}