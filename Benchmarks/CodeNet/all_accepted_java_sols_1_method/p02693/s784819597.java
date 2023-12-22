import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b-b%k > a || b-b%k == a){
            System.out.println("OK");
        }
        else{
            System.out.println("NG");
        }
        
    }
}