import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        String op;
        ArrayList<Integer> answer = new ArrayList<Integer>();

        while(true){
            x = sc.nextInt();
            op = sc.next();
            y = sc.nextInt();
            if(op.equals("?")) break;

            if(op.equals("+")) answer.add(x + y);
            else if(op.equals("-")) answer.add(x - y);
            else if(op.equals("*")) answer.add(x * y);
            else if(op.equals("/")) answer.add(x / y);
        }

        for(int i = 0; i < answer.size(); i++){
            System.out.println(answer.get(i));
        }

        sc.close();
    }
}
