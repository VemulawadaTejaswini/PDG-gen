import java.util.*;

class Main{           
  
   public static void main(String[] args){
         Scanner sc = new Scanner(System.in);  
         
         int n = sc.nextInt();

         boolean flag = false;
         int acount = 0;
         int uncount = 0;
         
         boolean noflag =false;
         
         for(int i = 0;i < n;i++){
             String s = sc.next();
             if(!flag && s.equals("A")){
                 acount++;
             }
             if(!flag && s.equals("Un")){
                 flag = true;                 
                 uncount++;
             }
             if(flag && s.equals("Un")){
                 uncount++;
             }
             if(flag && s.equals("A")){
                 if(acount == uncount){
                     acount = 1;
                     uncount = 0;
                     flag = false;
                 }else{
                     noflag = true;                     
                 }
             }                                           
         } 
         
         if(acount != uncount){
             System.out.println("NO");
             return;
         }
         
         if(noflag){
             System.out.println("NO");
             return;
         }
         System.out.println("YES");
         
   }         
         
 }