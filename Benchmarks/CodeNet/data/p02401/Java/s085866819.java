
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author k16069kk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        
        int a = 0; 
        int b = 0;
        String op = null;
        int answer = 0;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        while((line = br.readLine()) != null){
            java.util.StringTokenizer st = new StringTokenizer(line, " ");
            while (st.hasMoreTokens()){
                a = Integer.parseInt(st.nextToken());
                op = st.nextToken();
                b = Integer.parseInt(st.nextToken());
            }
            switch (op) {
                case "+":
                    answer = a + b;
                    break;
                case "-":
                    answer = a - b;
                    break;
                case "*":
                    answer = a * b;
                    break;
                case "/":
                    answer = a / b;
                    break;
            }
            if(op == "?") break;
        }
        
        System.out.println(answer);
    }

}

