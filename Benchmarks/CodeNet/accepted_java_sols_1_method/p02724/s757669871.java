import java.util.*;
class Main{
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int hap=x/500;
        int s=0;
        s=hap*1000;
        int rem=x%500;
        int re=5*(rem/5);
        System.out.println(s+re);

    }
}
