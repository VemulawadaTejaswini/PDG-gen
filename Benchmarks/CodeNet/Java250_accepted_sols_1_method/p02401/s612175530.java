import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	
    public static void main(String[] args) throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         while(true) {
             StringTokenizer st = new StringTokenizer(br.readLine());
             int a = Integer.parseInt(st.nextToken());
             String op = st.nextToken();
             int b = Integer.parseInt(st.nextToken());
             
             if(op.equals("+")) System.out.println(a+b);
             else if(op.equals("-")) System.out.println(a-b);
             else if(op.equals("*")) System.out.println(a*b);
             else if(op.equals("/")) System.out.println(a/b);
             else if(op.equals("?")) break;
         }
    }
}
