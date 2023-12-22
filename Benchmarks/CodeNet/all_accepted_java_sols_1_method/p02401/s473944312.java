import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line;
        while ((line = br.readLine()) != null) {
        
            String ary[] = line.split(" ");
            int num1 = Integer.parseInt(ary[0]);
            String op = ary[1];
            int num2 = Integer.parseInt(ary[2]);
            
            if(op.equals("?")){
                break;
            }
            
            switch (op) {
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "/":
                    System.out.println(num1 / num2);
                    break;
            }
        }
    }
}