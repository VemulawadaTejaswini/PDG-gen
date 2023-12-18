import java.util.Scanner;
public class Main{
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int X = sc.nextInt();
     int Y = sc.nextInt();
     int Z = sc.nextInt();
     
     int A ;
     A=X;
     X=Y;
     Y=A;
     
     int B;
     B=X;
     X=Z;
     Z=B;
     System.out.println(X+" "+Y+" "+Z);
    
   }
}  
  
