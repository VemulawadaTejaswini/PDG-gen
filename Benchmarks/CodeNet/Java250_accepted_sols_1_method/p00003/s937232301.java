import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        double a,b,c;
        for(int i=0;i<n;i++){
            String[] str = (br.readLine()).split(" ");
            a = Math.pow(Integer.parseInt(str[0]),2);
            b = Math.pow(Integer.parseInt(str[1]),2);
            c = Math.pow(Integer.parseInt(str[2]),2);
            if(a+b==c || a+c==b || b+c==a){
                sb.append("YES\n");
            }
            else{
                sb.append("NO\n");
            }
        }
        System.out.print(sb);
    }
}