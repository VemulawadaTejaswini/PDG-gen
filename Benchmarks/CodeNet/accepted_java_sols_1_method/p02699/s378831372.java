import java.util.*;
    class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        if(n<=a){
            System.out.println("unsafe");
        } else System.out.println("safe");
    }
}