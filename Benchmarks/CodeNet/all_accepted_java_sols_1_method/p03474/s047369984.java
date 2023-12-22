import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    private static final int MAX = 5000+24;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        while(in.hasNext()) {
            int a=in.nextInt(),b=in.nextInt();
            String code=in.next();
            boolean flag=code.length()==a+b+1;
            for(int i=0;i<code.length();i++){
                flag = flag & (i == a ? code.charAt(i) == '-' : Character.isDigit(code.charAt(i)));
            }
            out.println(flag?"Yes":"No");
            out.flush();
        }
        in.close();
        out.close();
    }

}
