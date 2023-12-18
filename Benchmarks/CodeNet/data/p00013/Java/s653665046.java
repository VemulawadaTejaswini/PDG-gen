import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static Stack<Integer> stack = new Stack<Integer>();
    static int train_number;
    public static void main(String[] args) {
        solve();
    }

    static void solve(){
        train_number = sc.nextInt();
        stack.push(train_number);
        while(sc.hasNextInt()){
            train_number = sc.nextInt();
            if(train_number == 0){
                System.out.println(stack.pop());
            }else{
                stack.push(train_number);
            }
        }
    }

}