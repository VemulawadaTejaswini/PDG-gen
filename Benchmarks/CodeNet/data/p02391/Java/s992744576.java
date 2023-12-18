import java.util.*;
  
class Main{
   public static void main(String[] args){
     Scanner stdId = new Scanner(System.in);
     int a = stdId.nextInt(); 
		 int b = stdId.nextInt();
     if(a<b) System.out.println("a < b");
     if(a>b) System.out.println("a > b");
     if(a==b) System.out.println("a == b");
  }
}