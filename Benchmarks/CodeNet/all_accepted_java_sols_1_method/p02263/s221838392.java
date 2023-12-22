import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str;
        ArrayDeque<Integer> stack=new ArrayDeque<Integer>();
        while(sc.hasNext()){
            str=sc.next();
            if(str.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }else if(str.equals("-")){
                stack.push((stack.pop()*-1)+stack.pop());
            }else if(str.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }else{
                stack.push(Integer.parseInt(str));
            }
        }
        System.out.println(stack.pop());
    }
}
