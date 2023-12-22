import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong(), a=sc.nextLong(), b=sc.nextLong();
        sc.close();
        if(b<=a) System.out.println("delicious");
        else if(b<=a+x) System.out.println("safe");
        else System.out.println("dangerous");
    }
}