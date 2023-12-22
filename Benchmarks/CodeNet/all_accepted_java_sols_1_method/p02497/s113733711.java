import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        while(true){
            String[] str = in.readLine().split(" ");
            int m = Integer.parseInt(str[0]);
            int f = Integer.parseInt(str[1]);
            int r = Integer.parseInt(str[2]);
            if     (m+f+r == -3) break;
            else if(m==-1||f==-1)sb.append("F\n");
            else if(m + f>=80)   sb.append("A\n");
            else if(m + f>=65)   sb.append("B\n");
            else if(m + f>=50)   sb.append("C\n");
            else if(m + f>=30){
                if (r>=50)       sb.append("C\n");
                else             sb.append("D\n");
            }
            else                 sb.append("F\n");
        }

        System.out.print(sb);
        in.close();
    }
}