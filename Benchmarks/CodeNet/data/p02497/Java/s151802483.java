import java.io.IOException;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mf = sc.nextInt() + sc.nextInt();
        int r = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        while(mf + r != -3){
            if     (mf>=80) sb.append("A\n");
            else if(mf>=65) sb.append("B\n");
            else if(mf>=50) sb.append("C\n");
            else if(mf>=30){
                if (r>=50)  sb.append("C\n");
                else        sb.append("D\n");
            }
            else            sb.append("F\n");
            mf = sc.nextInt() + sc.nextInt();
            r = sc.nextInt();
        }

        System.out.print(sb);
        sc.close();
    }
}