import java.util.*;
class Main{
    public static void main(String[] args){
        int d,t,s;
        Scanner sc =new Scanner(System.in);
        d=sc.nextInt();
        t=sc.nextInt();
        s=sc.nextInt();

        double a=d/s;
        if(t>=a)System.out.println("Yes");
        else System.out.println("No");
    }

}