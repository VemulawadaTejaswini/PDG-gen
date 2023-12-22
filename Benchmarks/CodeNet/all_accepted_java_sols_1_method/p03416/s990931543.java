import java.util.Scanner;
 
public class Main {
  public static void main (String[] args){
    
   int a,b;
   int tmp=0,cnt=0; 
 
   Scanner sc = new Scanner (System.in);
   a=sc.nextInt();
   b=sc.nextInt();

   for(int i=a;i<=b;i++){
     tmp=i%10;
     if(i/10000 == tmp){
      tmp=(i/10)%10;
      if((i/1000)%10 == tmp){
       cnt=cnt+1;
      }
    }
   }

   System.out.println(cnt);
  }
}