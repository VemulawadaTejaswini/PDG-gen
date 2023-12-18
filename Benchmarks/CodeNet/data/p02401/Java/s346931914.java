import java.io.*;

public class Main{
    public static void main(String[]args) throws NumberFormatException, IOException {
        while(true){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[]str= br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            String op = (str[1]);
            int b = Integer.parseInt(str[2]);
            int result = 0;
            if("+".equals(op))result=a+b;
            if("-".equals(op))result=a-b;
            if("*".equals(op))result=a*b;
            if("/".equals(op))result=a/b;
            if("?".equals(op))break;
            System.out.println(result);
        }
    }
}