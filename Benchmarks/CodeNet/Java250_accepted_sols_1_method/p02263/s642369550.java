import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        String[] t = br.readLine().split(" ");
        for(int i = 0; i < t.length; i++){
            if( t[i].equals("+") || t[i].equals("-") || t[i].equals("*") ){
                int ope1 = stack.pop();
                int ope2 = stack.pop();
                if(t[i].equals("+") ){
                    stack.push(ope1 + ope2);
                }else if(t[i].equals("-") ){
                    stack.push(ope2 - ope1);
                }else if(t[i].equals("*") ){
                    stack.push(ope1 * ope2);
                }
            }else{
                int ope = Integer.parseInt(t[i]);
                stack.push(ope);
            }
        }
        int ans = stack.pop();
        System.out.println(ans);
    }

}