import java.util.Scanner;
import java.util.Stack;

/**
 * Created by ??\??? on 2016/12/6.
 */
public class Main {
    static boolean isNum(String s){
        char[] array = s.toCharArray();
        int flag = 0;
        if(array[0]=='-'&&s.length()>1)
            flag = 1;
        for (char c : array) {
            if(!Character.isDigit(c)){
                flag--;
            }
            if(flag<0)
                return false;
        }
        return true;
    }
    static int si(String s){
        if(isNum(s))
            return Integer.parseInt(s);
        else {
            return -1000000010;
        }
    }
    static int count(String s,String a,String b){
        if(s.equals("+"))
            return si(a)+si(b);
        if(s.equals("-"))
            return si(b)-si(a);
        if(s.equals("*"))
            return si(a)*si(b);
        if(s.equals("/"))
            return si(b)/si(a);
        return -1000000020;
    }
    static int run(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] lines = scan.nextLine().split(" ");
        Stack<String> vs = new Stack<>();
        //Stack<String> os = new Stack<>();
        for (String s:lines) {
            if(isNum(s))
                vs.push(s);
            else{
                String o = s;
                String a = vs.pop();
                String b = vs.pop();
                String c = String.valueOf(count(o,a,b));
                //System.out.println(a+" "+b+" "+c);
                vs.push(c);
            }
        }
        System.out.println(vs.pop());
        return 0;
    }
    public static void main(String[] args){
        run(args);
        //System.out.println(Integer.parseInt("-1"));
    }
}