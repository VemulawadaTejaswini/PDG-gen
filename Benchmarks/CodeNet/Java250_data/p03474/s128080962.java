import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);
        
        String[] pCodeStyle = br.readLine().split(" ");
        int pCodeStyleFront = Integer.parseInt(pCodeStyle[0]);
        int pCodeStyleBack = Integer.parseInt(pCodeStyle[1]);
        
        String S = br.readLine();
        
        while(true){
            if(S.length() == pCodeStyleFront + pCodeStyleBack + 1){
                if(S.indexOf("-") == pCodeStyleFront){
                    if(S.indexOf("-", pCodeStyleFront + 1) < 0){
                        writer.println("Yes");
                        break;
                    }
                }
            }
            writer.println("No");
            break;
        }
        br.close();
        writer.close();
    }
}