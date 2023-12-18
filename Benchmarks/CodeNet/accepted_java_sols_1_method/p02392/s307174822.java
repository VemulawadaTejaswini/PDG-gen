import java.util.*;
  
class Main{
   public static void main(String[] args){
     Scanner stdId = new Scanner(System.in);
     int a = stdId.nextInt(); 
		 int b = stdId.nextInt();
		 int c = stdId.nextInt();
     if(a<b && b<c) System.out.println("Yes");
     else System.out.println("No");
  }
}