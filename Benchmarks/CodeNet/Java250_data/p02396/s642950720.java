import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int i=1;
        while(true){
            int x = Integer.parseInt(br.readLine());
            if(x == 0) break;
            sb.append("Case");
            sb.append(" ");
            sb.append(Integer.toString(i++));
            sb.append(":");
            sb.append(" ");
            sb.append(Integer.toString(x));
            sb.append("\n");
        }
        System.out.print(sb);
    }
}