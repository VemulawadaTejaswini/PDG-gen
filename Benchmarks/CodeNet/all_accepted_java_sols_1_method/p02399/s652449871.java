import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        double e;
        a=sc.nextInt();
        b=sc.nextInt();
        c=a/b;
        d=a%b;
        e=(double)a/(double)b;
        System.out.println(c+" "+d+" "+String.format("%.8f",e));
    }
}
