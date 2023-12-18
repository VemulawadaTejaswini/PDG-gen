import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i=2; i<n+1; i++){
            String s = String.valueOf(i);
            if (i%3==0){
                sb.append(" "+i);
            }else{
                for (int k=0; k<s.length(); k++){
                    if (s.indexOf('3')!=-1){
                        sb.append(" "+i);
                        break;
                    }
                }
            }
        }
        System.out.println(sb.toString());
    }
}