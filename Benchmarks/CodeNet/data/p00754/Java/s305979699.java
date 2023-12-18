import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        Scanner sc = new Scanner(new File(System.in));
        while(sc.hasNext()){
            String temp = sc.nextLine();
            if(temp.equals(".")) return;
            if(solve(temp)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }

    static boolean solve(String line){
        int cirNum=0, sqNum=0;
        Stack<Character> balance = new Stack<Character>();
        for(int i=0;i<line.length();i++){
            char temp = line.charAt(i);

            if(temp=='(' || temp=='['){
              balance.push(temp);
            }else if(temp==')'){
                if(balance.isEmpty()) return false;
                if(balance.peek()!='('){
                    return false;
                }else{
                    balance.pop();
                }
            }else if(temp==']'){
                if(balance.isEmpty()) return false;
                if(balance.peek()!='['){
                    return false;
                }else{
                    balance.pop();
                }
            }
        }
        return true;
    }
}