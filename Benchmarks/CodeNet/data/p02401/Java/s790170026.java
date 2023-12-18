import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        try(Scanner scan=new Scanner(System.in)){
            while(true){
                int a=scan.nextInt();
                String op=scan.next();
                int b=scan.nextInt();
                int answer;
                switch(op){
                    case "+":
                        answer=a+b;
                        break;
                    case "-":
                        answer=a-b;
                        break;
                    case "*":
                        answer=a*b;
                        break;
                    case "/":
                        answer=a/b;
                        break;
                    default:
                        return;
                }
                System.out.println(answer);
            }
            
        }
    }
}
