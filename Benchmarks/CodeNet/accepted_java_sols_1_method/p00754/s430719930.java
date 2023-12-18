import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            boolean flag=true;
            String str=sc.nextLine();
            if (str.equals(".")) break;
            Stack<Character> kakko=new Stack<Character>();
            for(int i=0;i<str.length();i++){
                char s=str.charAt(i);
                if(s=='(' || s=='[') kakko.push(s);
                else if(s==')'){
                    if(kakko.empty() || kakko.peek()=='['){
                        flag=false;
                        break;
                    }else kakko.pop();
                }
                else if(s==']'){
                    if(kakko.empty() || kakko.peek()=='('){
                        flag=false;
                        break;
                    }else kakko.pop();
                }
            }
            if(flag && kakko.empty()) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
