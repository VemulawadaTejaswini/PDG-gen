import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int A=sc.nextInt(),B=sc.nextInt(),res=0,r=1;
        while(r<B){
            res++;
            r+=A-1;
        }
        System.out.println(res);
    }
}