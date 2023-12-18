import java.util.Scanner;
 
public class Main {
  public static void main (String[] args){
    
   int n,a,b,c=0,d=0,e=0; 

   Scanner sc = new Scanner (System.in);
   n=sc.nextInt();
   a=sc.nextInt();
   b=sc.nextInt();
 
   for(int i=1;i<n+1;i++){
    c=i%10;
    d=i/10;
    c=c+(d%10);
    d=d/10;
    c=c+(d%10);
    d=d/10;
    c=c+(d%10);
    d=d/10;
    c=c+(d%10);
    
    if(c>=a && c<=b){
     e=e+i;
    }
   }    
   System.out.println(e);
  }
}