import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int xSubA = x-a;
        while(xSubA >= b){
            xSubA = xSubA - b;
        }
        System.out.println(xSubA);
    }
}