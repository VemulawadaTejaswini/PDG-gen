import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class Main{
    private static final Scanner sc = new Scanner(System.in);
    private static final PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] Args) throws IOException{
        final StringBuilder str = new StringBuilder(sc.next());
        final int n = Integer.parseInt(sc.next());
        for(int i = 0; i<n; i++){
            final String com = sc.next();
            final int a = Integer.parseInt(sc.next());
            final int b = Integer.parseInt(sc.next());
            if(com.equals("print")){
                out.println(str.substring(a, b+1));
            }else if(com.equals("reverse")){
                final StringBuilder p = new StringBuilder(str.substring(a, b+1));
                p.reverse();
                str.replace(a, b+1, p.toString());
            }else if(com.equals("replace")){
                str.replace(a, b+1, sc.next());
            }
        }
        out.flush();
    }
}