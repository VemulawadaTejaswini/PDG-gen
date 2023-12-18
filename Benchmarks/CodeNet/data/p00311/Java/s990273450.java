import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int h1,h2,k1,k2,a,b,c,d;
        int hcnt=0;
        int kcnt=0;
        h1=sc.nextInt();
        h2=sc.nextInt();
        k1=sc.nextInt();
        k2=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        hcnt=h1*a+c*(h1/10)+h2*b+d*(h2/20);
        kcnt=k1*a+c*(k1/10)+k2*b+d*(k2/20);
        if(hcnt>kcnt){
            System.out.println("hiroshi");
        }else if(kcnt>hcnt){
            System.out.println("kenjiro");
        }else{
            System.out.println("even");
        }
        
    }
}
