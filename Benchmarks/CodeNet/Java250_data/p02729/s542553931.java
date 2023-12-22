import java.util.*;

public class Main{
    static int count=0;
    static int count1=0;
    public static void main(String[] args){
        int a=0;
        int b=0;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
       
        count = func(a);
        count1=func2(b);
        
        System.out.println((count)+(count1));
    }
    static int func(int a){
    if(a>=1)     
    count =(a-1)+func(a-1);
    return count;
    
    }
    static int func2(int b){
    if(b>=2)     
    count1 =(b-1)+func2(b-1);
    return count1;
    
    }
}