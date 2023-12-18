import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        
        int result;
        static final MAX=20000;
        static final MIN=0;
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new Stringbuilder();

        
        while(true){
            String data[]=reader.readLine().split(" ");
            int a=Integer.parseInt(data[0]);
            int b=Integer.parseInt(data[2]);
            String op=data[1];
            
            if(op.equals("+")) result=a+b;
            else if(op.equals("-")) result=a-b;
            else if(op.equals("*")) result=a*b;
            else if(op.equals("/")) result=a/b;
            else if(op.equals("?")) break;
            
            System.out.println(result);
        }
        
    }
}