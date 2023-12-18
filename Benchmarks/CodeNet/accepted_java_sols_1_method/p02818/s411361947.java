import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        long c=sc.nextLong();
        if(a-c<0&&a+b>=c){
            System.out.println("0 "+(b-(c-a)));
        }else if(a+b<=c){
            System.out.println("0 0");
        }else{
            System.out.println(a-c+" "+b);
        }
    }
    
}
