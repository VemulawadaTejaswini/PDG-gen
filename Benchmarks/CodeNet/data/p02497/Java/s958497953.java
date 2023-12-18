import java.io.IOException;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int f = sc.nextInt();
        int r = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        while(m + f + r != -3){
            if     (m==-1||f==-1)sb.append("F\n");
            else if(m + f>=80)   sb.append("A\n");
            else if(m + f>=65)   sb.append("B\n");
            else if(m + f>=50)   sb.append("C\n");
            else if(m + f>=30){
                if (r>=50)       sb.append("C\n");
                else             sb.append("D\n");
            }
            else                 sb.append("F\n");
            m = sc.nextInt();
            f = sc.nextInt();
            r = sc.nextInt();
        }

        System.out.print(sb);
        sc.close();
    }
}