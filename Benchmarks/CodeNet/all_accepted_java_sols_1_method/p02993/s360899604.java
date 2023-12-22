      import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s = sc.next();
     boolean flag=true;
     for(int i=0;i<s.length()-1;i++){
       if(s.charAt(i)==s.charAt(i+1)){
         System.out.println("Bad");
         flag = false;
         break;
       }
     }
     if(flag){
       System.out.println("Good");
     }
   }
}
