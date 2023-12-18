import java.util.*;
public class Main{
      public static void main(String[] args){
          Scanner sc =new Scanner (System.in);
          String a;
          int n ;
          a = sc.nextLine();
          int l =a.length();
          for (n=0;n<l;n++){
              char b =a.charAt(n);
              if(Character.isLowerCase(b)){
                  System.out.print(Character.toUpperCase(b));
              }else if(Character.isUpperCase(b)){
                  System.out.print(Character.toLowerCase(b));
              }else{
                  System.out.print(b);
              }
             }
          
          System.out.printf("\n");
            }


          

    

}
