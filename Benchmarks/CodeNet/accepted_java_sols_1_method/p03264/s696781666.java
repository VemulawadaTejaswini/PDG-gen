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
        int intans = 0;
        int odd = 0;
        int eve = 0;
        for(int i = 1;i<=a;i++){
            if(i%2==0){
                eve += 1;
            }else{
                odd += 1;
            }
        }
    intans = eve * odd;
        PrintWriter out = new PrintWriter(System.out);
        out.println(intans);
        out.flush();
        scan.close();
    }
}