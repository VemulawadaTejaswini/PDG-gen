import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = Integer.parseInt(sc.next());
        int num2 = Integer.parseInt(sc.next());
        int num3 = Integer.parseInt(sc.next());
        int sum = num1 + num2 + num3;
        if(sum>=22){
            System.out.println("bust");
        }else{
            System.out.println("win");
        }
    }
}