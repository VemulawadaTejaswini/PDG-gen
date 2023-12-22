import java.util.Scanner;

public class Main{
 public static void main(String[] a){
     Scanner s = new Scanner(System.in);
     int i,x,now;
     boolean ch=false;
     x = s.nextInt();
     for(i=1;i<=x;i++){
         now=i;
         if(i%3==0)ch=true;
         while(now>0&&ch==false){
            if(now%10==3)ch=true;
            now/=10;
         }
         if(ch==true){
             ch=false;
             System.out.print(" "+i);
         }
     }
    System.out.println();
 }   
}
