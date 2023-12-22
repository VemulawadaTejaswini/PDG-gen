import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        PrintWriter cout = new PrintWriter(System.out);

        int n = cin.nextInt();
        cin.nextLine();
        String s = cin.nextLine();

        int cnt = 1;
        char last = s.charAt(0);
        for(int i=1;i<n;i++) {
            char cur = s.charAt(i);
            if(last == cur) continue;
            else cnt++;
            last = cur;
        }

        cout.println(cnt);
        cout.close();
    }
}