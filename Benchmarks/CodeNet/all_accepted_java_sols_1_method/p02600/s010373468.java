import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(bu.readLine());
        if(n>= 400 && n <= 599)
            sb.append(8);
        else if (n>=600 && n <= 799)
            sb.append(7);
        else if (n>=800 && n<=999)
            sb.append(6);
        else if (n>=1000 && n <= 1199)
            sb.append(5);
        else if (n>=1200 && n<= 1399)
            sb.append(4);
        else if (n>=1400 && n<=1599)
            sb.append(3);
        else if (n>=1600 && n<= 1799)
            sb.append(2);
        else
            sb.append(1);
        System.out.print(sb);
    }
}
