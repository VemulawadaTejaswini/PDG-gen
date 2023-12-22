import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //入力値を設定する
        Integer firstNum = sc.nextInt();
        Integer secondNum = sc.nextInt();
        Integer thirdNum = sc.nextInt();
        
        if(firstNum + secondNum + thirdNum <= 21) {
            System.out.println("win");
        } else {
            System.out.println("bust");
        }

    }    
}
