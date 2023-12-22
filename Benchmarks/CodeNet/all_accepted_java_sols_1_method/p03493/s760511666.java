//package Contest081;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
            String str = sc.nextLine();
            int cnt =0;
            for(char x :str.toCharArray())
                if(x=='1')
                    cnt++;
            out.println(cnt);
        out.flush();
    }
}
