import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = a+b;
        int num = Integer.parseInt(c);

        int num2 = (int)Math.sqrt(num);

        if(num ==(num2*num2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }




        
    }
}
