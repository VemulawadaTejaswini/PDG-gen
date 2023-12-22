import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //約数か判断
        if((b % a) == 0){
            System.out.println(a + b);
        }else{
            System.out.println(-a + b);
        }
    }
}