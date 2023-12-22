import java.util.*;
 class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double t=sc.nextDouble()+0.5;
        
        int k=0;
        int s=a;
        while((double)s<t)
        {
            k=k+b;
            s=s+a;
        }
        System.out.println(k);
    }
}
