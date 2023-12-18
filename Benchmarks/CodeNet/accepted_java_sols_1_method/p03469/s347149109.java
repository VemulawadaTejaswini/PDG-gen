import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    private static final int MAX = 500+24;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        while(in.hasNext()) {
            String str=in.nextLine();
            String answer=str.substring(0,3)+"8"+str.substring(4);
            out.println(answer);
            out.flush();
        }
        in.close();
        out.close();
    }

}
