import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        PrintWriter cout = new PrintWriter(System.out);

        char[] c = cin.nextLine().toCharArray();
        int len = c.length;
        boolean ans = true;
        for(int i=1;i<=len;i++) {
            if(i % 2 == 0) { 
                if(c[i-1] == 'L' || c[i-1] == 'U' || c[i-1] == 'D') continue;
            }
            else {
                if(c[i-1] == 'R' || c[i-1] == 'U' || c[i-1] == 'D') continue;
            }
            ans = false;
            break;
        }

        cout.println(ans ? "Yes" : "No");
        cout.close();
    }
}
