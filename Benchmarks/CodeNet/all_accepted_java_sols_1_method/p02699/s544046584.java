import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt();
        int W = sc.nextInt();
        if(N<=W)
        System.out.println("unsafe");
        else
            System.out.println("safe");
    }
}