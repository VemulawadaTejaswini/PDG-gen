import java.io.*;
import java.util.Scanner;

class Main {
	public static void main (String[] args) {
        String res, tmp;
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.next());
        
        res = in.next();
        for (int i=0; i<n-1; i++) {
            tmp = in.next();
            if (res.compareTo(tmp) > 0)
                res = tmp;
        }
        System.out.println(res);
	}
}