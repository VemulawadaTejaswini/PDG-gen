import java.util.Stack;
import java.io.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> S = new Stack<Integer>();
        int a, b;


        try{
            String input[] = br.readLine().split("\\s+");

            for(int i = 0; i < input.length; i++){
                if(!input[i].equals("+") && !input[i].equals("-") && !input[i].equals("*")) {
                     S.push(Integer.parseInt(input[i])); //intに変換
                    continue;
                }

                b = S.peek();
                S.pop();
                a = S.peek();
                S.pop();

                if(input[i].equals("+")) {
                    S.push(a+b);
                } else if(input[i].equals("-")) {
                    S.push(a-b);
                } else if(input[i].equals("*")) {
                    S.push(a*b);
                }
            }
            System.out.println(S.peek());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

}

