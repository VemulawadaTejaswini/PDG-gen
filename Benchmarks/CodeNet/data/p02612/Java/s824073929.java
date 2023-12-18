import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%1000==0) System.out.println(0);
        else{
            n=n%1000;
            int balance=1000-n;
            System.out.println(balance);
        }
    }
}