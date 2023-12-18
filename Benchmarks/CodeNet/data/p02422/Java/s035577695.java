import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        int begin,end;
        String op;
        sb.append(br.readLine());
        int q = Integer.parseInt(br.readLine());
        while(q-->0){
            String str[] = br.readLine().split(" ");
            op = str[0];
            begin = Integer.parseInt(str[1]);
            end = Integer.parseInt(str[2])+1;
            if(op.equals("print")){
                ans.append(sb.substring(begin, end)).append("\n");
            }else if(op.equals("reverse")){
                sb2.append(sb.substring(begin,end));
                sb.replace(begin, end, sb2.reverse().toString());
            }else{
                sb.replace(begin, end, str[3]);
            }
        }
        System.out.print(ans);
    }
}