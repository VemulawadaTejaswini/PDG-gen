import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

class Main{
    private static final InputStreamReader ir = new InputStreamReader(System.in);
    private static final PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] Args) throws IOException{
        int in;
        while( (in = ir.read())!=-1){
            if(Character.isLowerCase(in)) out.write(Character.toUpperCase(in));
            else if(Character.isUpperCase(in)) out.write(Character.toLowerCase(in));
            else out.write(in);
        }
        out.flush();
    }
}