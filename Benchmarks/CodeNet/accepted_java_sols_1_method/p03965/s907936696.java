import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        String a = in.next();
        int c = 0;int s = 0;
        for (int i=0;i<a.length();i++){
            char next = a.charAt(i);
            if (c==0){
                if(next == 'p'){
                    s--;
                }
            }
            else {
                if(next=='g'){
                    s++;
                }
            }
            c^=1;
        }
        System.out.println(s);
    }
}