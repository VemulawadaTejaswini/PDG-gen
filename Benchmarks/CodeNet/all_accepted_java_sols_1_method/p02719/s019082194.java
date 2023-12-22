import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        Long N = sc.nextLong();
        Long K = sc.nextLong();
        Long a = N % K;

        if(a<=K/2){
            System.out.println(a);
        }
        else{
            System.out.println(K - a);
        }
    }
}