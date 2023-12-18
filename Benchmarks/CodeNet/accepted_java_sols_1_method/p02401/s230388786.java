import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();
            
            if(("?").equals(op)){
                break;
            }else{
                if((op).equals("+")){
                    System.out.println(a + b);
                }else if((op).equals("-")){
                    System.out.println(a - b);
                }else if((op).equals("*")){
                    System.out.println(a * b);
                }else{
                    System.out.println(a / b);
                }
                
            }
        }
    }
}
