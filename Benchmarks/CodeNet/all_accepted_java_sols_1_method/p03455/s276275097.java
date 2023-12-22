import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //aの入力
        int a = Integer.parseInt(sc.next());
        //bの入力
        int b = Integer.parseInt(sc.next());
        int x = a * b;
        if(x % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");;
        }
        sc.close();
    }
}