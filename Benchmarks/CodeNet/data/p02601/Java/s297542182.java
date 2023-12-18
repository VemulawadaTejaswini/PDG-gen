import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String [] inp = bu.readLine().split(" " );
        int a = Integer.parseInt(inp[0]), b = Integer.parseInt(inp[1]), c = Integer.parseInt(inp[2]);
        int totSteps = Integer.parseInt(bu.readLine());
        int steps = 0;
        boolean check = true;
        while (b <= a)
        {
            b*=2;
            steps++;
            if (steps > totSteps)
            {
                check = false;
                break;
            }
        }
        if(!check){
            sb.append("No");
        }
        else {
            while(c <= b){
                c*=2;
                steps++;
                if (steps>totSteps){
                    check = false;
                    break;
                }
            }
            if (!check)
                sb.append("No");
            else
                sb.append("Yes");
        }


        System.out.print(sb);
    }
}
