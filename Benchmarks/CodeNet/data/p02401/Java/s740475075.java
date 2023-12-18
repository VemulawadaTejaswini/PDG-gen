import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String op = "";
        while(!op.equals("?")){
            int answer = 0;
            String tmp = in.nextLine();
            String[] line = tmp.split(" ");
            int num1 = Integer.parseInt(line[0]);
            int num2 = Integer.parseInt(line[2]);
            op = line[1];
            switch(op){
                case "+":
                    answer = num1 + num2;
                    System.out.printf("%d%n",answer);
                    break;
                case "-":
                    answer = num1 - num2;
                    System.out.printf("%d%n",answer);
                    break;
                case "*":
                    answer = num1 * num2;
                    System.out.printf("%d%n",answer);
                    break;
                case "/":
                    answer = num1 / num2;
                    System.out.printf("%d%n",answer);
                    break;
            }
        }
    }
}
