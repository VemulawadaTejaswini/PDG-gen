import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = 1,l;
        String s = "1";
        char[] c;
        int cnt;
        while( !s.equals("0")){
            cnt = 0;
            s = sc.next();
            c = s.toCharArray();
            if(s.equals("0")) break;
            l = s.length();
            for(int i = 0;i<l;i++){
                cnt += c[i] - '0';
            }
            System.out.printf("%d%n",cnt);
            
        }
        sc.close();
        
        
    }
}


