
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long temp;
            if(a==b){
                System.out.println(1+" "+a);
                continue;
            }
            
            if(a<b){
                temp=a;
                a=b;
                b=temp; //a>bにしちゃったの
            }
            
            //a = b*p + r
            //b = r*p' + r'
            long GCD=1; //最大公約数
            long LCM=a; //最小公倍数
            long c=a,d=b;
            long r;
            while(true){
                r = c%d;
                if(r!=0){
                    c = d;
                    d = r;
                }else{
                    GCD=d;
                    LCM=a*b/GCD;
                    /*
                     a=p*GCD
                     b=q*GCD pとqは互いに素
                     このとき
                     LCM=p*q*GCD
                        =p*q*GCD*GCD/GCD
                        =(p*GCD)*(q*GCD)/GCD
                        =a*b/GCD
                     よって
                     LCM=a*b/GCD                     
                     */
                    
                    break;
                }
            }
            System.out.println(GCD+" "+LCM);
            
            
        }
    }
}