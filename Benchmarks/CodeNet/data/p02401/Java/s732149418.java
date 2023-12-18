import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されメソッド・スタブ
        Scanner scan = new Scanner(System.in);


        while(true){
            int a = scan.nextInt();
            String op = scan.next();
            int b = scan.nextInt();
            int answer=0;

            if(op.equals("?")){
                break;
            }
            switch(op){
            case "+":
                answer= a+b;
                break;
            case "-":
                answer= a-b;
                break;
            case "*":
                answer = a*b;
                break;
            case "/":
                answer = a/b;
                break;
            }
            System.out.printf("%d\n",answer);
        }

    }

}

