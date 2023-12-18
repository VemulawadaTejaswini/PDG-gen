import java.util.Stack;
import java.util.Scanner;
import java.lang.Integer;

public class Main {

    // the method checks if it is an integer
    public static boolean isInteger(String value){
        boolean isInteger = false;
        try{
            Integer.parseInt(value);
            isInteger = true;
        }catch(NumberFormatException ex){
        }
        return isInteger;
    }

    // method to covert a string to operator
    public static int toOperator(String operator, int value1, int value2){
        int result=0;
        if(operator.equals("+")){
            result = value1+value2;
        }else if (operator.equals("-")){
            result = value2-value1;
        }
        else if(operator.equals("*")){
            result = value1*value2;
        }
        else if (operator.equals("/")){
            result = value1/value2;
        }
        return result;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Scanner input1 = new Scanner(System.in);
        int value1;
        int value2;

        String element = input1.nextLine();
        String elements[] = element.split(" ");
        for (String e : elements) //(int i=0; i< elements.length)
        {
            if(isInteger(e)){
                stack.push(Integer.parseInt(e));
            }else{
                value1 = stack.pop();
                value2 = stack.pop();
                //System.out.println(value1+" "+value2);
                stack.push(toOperator(e,value1,value2));
        }

        }
        System.out.println(stack.pop());
    }}

