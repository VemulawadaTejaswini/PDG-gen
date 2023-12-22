import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        sc.close();
        System.out.println((n*(n-1))/2);
    }
}