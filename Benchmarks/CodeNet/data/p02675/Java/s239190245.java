import java.util.*;

class Main{


     public static void main(String args[]){
     
       Scanner in = new Scanner(System.in);
       String s = in.next();
       char c= s.charAt(s.length()-1);
       if(c=='3'){
       System.out.println("bon");
       } else if(c=='1' || c=='0'|| c=='6' || c=='8'){
                System.out.println("pon");

       } else{
                         System.out.println("hon");

       }
     }

}
