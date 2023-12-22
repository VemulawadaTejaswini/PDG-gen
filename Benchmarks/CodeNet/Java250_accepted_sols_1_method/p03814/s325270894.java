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
        String s = in.next();
        int idex = -1;int c = 0;
        int ans = 0;
        for(int i=0;i<s.length();i++){
            if(idex==-1){
                if( s.charAt(i)=='A'){
                    idex = i;
                    c++;
                }

            }
            else {
                c++;
                if (s.charAt(i)=='Z'){
                    ans=c;
                }
            }
        }
        System.out.println(ans);
    }
}