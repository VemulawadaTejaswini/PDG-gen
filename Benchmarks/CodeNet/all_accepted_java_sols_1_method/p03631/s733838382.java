import java.util.*;
/**
 * Created by 卢嘉昊 on 2017/8/12.
 */
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int a = k%10;
        int b = k/100;
        if(a==b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}