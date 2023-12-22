import java.util.*;
class Main{
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int count=0;
        int temp=0;
        int m=sc.nextInt();
        int l=sc.nextInt();
        count=l-2*m;
        count=count/2;
        temp=m-count;

         if(count*4+temp*2==l&&(m*4>=l&&(m-count>=0)&&(l-2*m>=0))){
        System.out.println("Yes");
        }
        else
         System.out.println("No");
     }
    
}
