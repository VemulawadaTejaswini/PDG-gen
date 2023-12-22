import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String lines[] = br.readLine().split(" ");
            if ("?".equals(lines[1]))
                break;
            int a = Integer.parseInt(lines[0]);
            int b = Integer.parseInt(lines[2]);
            if ("+".equals(lines[1])){
                System.out.println(a+b);
            }else if ("-".equals(lines[1])){    
                System.out.println(a-b);
            }else if ("*".equals(lines[1])){ 
                System.out.println(a*b);
            }else if ("/".equals(lines[1])){   
                System.out.println(a/b);
            }
        }
    }
}