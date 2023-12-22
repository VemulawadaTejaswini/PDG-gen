import java.io.IOException;
import java.util.Scanner;

class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] Args) throws IOException{
        final int n = Integer.parseInt(sc.next());
        int taro = 0, hanako = 0;
        for(int i = 0; i<n; i++){
            final String tc = sc.next();
            final String hc = sc.next();
            final int judge = tc.compareTo(hc);
            if(judge<0) hanako += 3;
            else if(judge>0) taro += 3;
            else{
                taro++;
                hanako++;
            }
        }
        System.out.println(taro+" "+hanako);
    }
}