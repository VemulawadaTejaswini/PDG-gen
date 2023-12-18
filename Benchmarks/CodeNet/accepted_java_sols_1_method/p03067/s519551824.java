import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());
        int c = Integer.parseInt(scan.next());
        String answer = "No ";
        if(a>b){
            for(int i = b;i<a;i++){
                if(c == i){
                    answer = "Yes";
                    break;
                }
            }
        }else{
            for(int i = a;i<b;i++){
                if(c == i){
                    answer = "Yes";
                    break;
                }
            }
        }


        PrintWriter out = new PrintWriter(System.out);
        out.println(answer);
        out.flush();
        scan.close();
    }
}