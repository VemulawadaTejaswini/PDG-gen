import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int MAX = 100+24;
    private static int[] d=new int[MAX];
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        while(in.hasNext()) {
            int n=in.nextInt();
            for(int i=0;i<n;i++){
                d[i]=in.nextInt();
            }
            Arrays.sort(d,0,n);
            int answer=1;
            for(int i=1;i<n;i++){
                answer += d[i]!=d[i-1]?1:0;
            }
            out.println(answer);
            out.flush();
        }
        in.close();
        out.close();
    }

}
