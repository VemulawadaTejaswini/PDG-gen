import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> S = new Stack<>();

        String input = sc.nextLine();
        String[] input_ = input.split(" ");
        sc.close();

        for(int i = 0; i < input_.length; i++){
            if(input_[i].equals("+")){
                int x = S.pop();
                int y = S.pop();
                S.push(y + x);
            }else if(input_[i].equals("-")){
                int x = S.pop();
                int y = S.pop();
                S.push(y - x);
            }else if(input_[i].equals("*")){
                int x = S.pop();
                int y = S.pop();
                S.push(y * x);
            }else{
                S.push(Integer.parseInt(input_[i]));
            }
        }
        System.out.println(S.firstElement());
    }
}

