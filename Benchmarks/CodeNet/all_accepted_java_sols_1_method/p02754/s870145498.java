import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();
    long k = n/(a+b);
    
    if(a==0){
    System.out.print("0");
    }else if(n%(a+b)<=a){
    System.out.println(a*k+n%(a+b));
    }else{
    System.out.println(a*k+a);
}
}
}