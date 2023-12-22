import java.util.*;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        //a();
        //b();
        c();
        //d();
    }
    public static void a(){
        int a=sc.nextInt();int b=sc.nextInt();
        System.out.println((a>9||b>9)?-1:a*b);
    }
    public static void b(){
        int n=sc.nextInt();
        int po[]=new int[81];
        boolean b=false;
        for(int i=0;i<9;i++)
        for(int j=0;j<9;j++)if((i+1)*(j+1)==n)b=true;
        System.out.println(b?"Yes":"No");
    }
    public static void c(){
        long n=sc.nextLong();
        long q=(long)Math.sqrt(n);
        long index=n;
        for(int i=2;i<=q;i++){
            if(n%i==0)index=i;
        }
        System.out.println(index+(n/index)-2);
    }
    public static void d(){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=sc.nextInt();
        if((double)2*x/(a*a)-b>=0){
            double bb=((double)2*x)/(a*a)-b;
            System.out.println(Math.atan((-bb+b)/a)*180/Math.PI);
        }
        else{
            double aa=((double)2*x)/(a*b);
            System.out.println(Math.atan(((double)b)/aa)*180/Math.PI);
        }
        
    }
}
