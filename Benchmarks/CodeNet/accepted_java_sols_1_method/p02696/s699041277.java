import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        long A = sc.nextLong();
        long B = sc.nextLong();
        long N = sc.nextLong();
        long i =Math.min(B-1,N);
        System.out.println((A*i/B)-A*(i/B));
    }
}