import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l",
                "m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        Stack<String> stack = new Stack<String>();

        while(N>26) {
            long remain = N%26;
            if(remain==0) {
                remain=26;
            }
            stack.add(alphabet[(int)(remain-1)]);
            N-=remain;
            N/=26;
        }
        long last_remain = N%26;
        if(last_remain == 0) {
            last_remain=26;
        }
        stack.add(alphabet[(int)(last_remain-1)]);

        while(!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

	}

}