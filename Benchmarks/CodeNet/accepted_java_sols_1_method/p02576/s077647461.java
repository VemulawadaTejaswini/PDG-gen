import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int N=sc.nextInt(),X=sc.nextInt(),T=sc.nextInt(),res=0;
        res+=(N/X)*T;
        if(N%X!=0){
            res+=T;
        }
        System.out.println(res);
    }
}
