import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();
        int s = 0;

        if(op.equals("+")){
            s = a + b;
        }else{
            s = a - b;
        }
        System.out.println(s);

    } 
}