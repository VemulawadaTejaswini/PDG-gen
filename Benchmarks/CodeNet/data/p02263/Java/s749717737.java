import java.util.*;
import java.io.*;

class Main{
        static final String[] operator = {"+", "-", "*"};
        static Stack<Integer> stack = new Stack<Integer>();
        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        static void doPlus(){
                int a=stack.pop();
                a += stack.pop();
                stack.push(a);
        }
        static void doMinus(){
                int a = 0 - stack.pop();
                a += stack.pop();
                stack.push(a);
        }
        static void doMul(){
                int a=stack.pop();
                a *= stack.pop();
                stack.push(a);
        }
        static void doPop(String i){
                stack.push(new Integer(i));
        }
        public static void main(String[] args) throws IOException{
                String[] elements = br.readLine().split(" ");
                for(String e : elements){
                        switch (e){
                                case "+":
                                        doPlus();
                                        break;
                                case "-":
                                        doMinus();
                                        break;
                                case "*":
                                        doMul();
                                        break;
                                default:
                                        doPop(e);
                        }
                }
                while(!stack.empty()){
                        System.out.print(stack.pop());
                        if(!stack.empty())
                                System.out.print(" ");
                }
                System.out.println();
        }
}