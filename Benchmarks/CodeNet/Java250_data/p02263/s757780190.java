
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by sd on 2016/11/22.
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<String> stack = new LinkedList<>();
        while(sc.hasNext()){
            String c = sc.next();

            switch(c){
                case "+":
                case "-":
                case "*":
                    int a = Integer.parseInt(stack.pop()), b = Integer.parseInt(stack.pop());
                    switch(c) {
                        case "+":
                            stack.push(a+b+"");
                            break;
                        case "-":
                            stack.push(-a+b+"");
                            break;
                        case "*":
                            stack.push(a*b+"");
                            break;
                    }
                    break;
                default:
                    stack.push(c);
                    break;
            }
//
//            for(int i=0; i<stack.size(); i++){
//                System.out.print(stack.get(i)+", ");
//            }
//            System.out.println();

        }
        System.out.println(stack.pop());

    }
}