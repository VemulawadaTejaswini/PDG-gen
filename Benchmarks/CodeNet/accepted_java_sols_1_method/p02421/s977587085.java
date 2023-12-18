import java.util.*;
public class Main {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.nextLine());
      String sTaro;
      String sHanako;
      int iTaro = 0;
      int iHanako = 0;
      
      for(int i = 0; i < n; i++){
         sTaro = sc.next();
         sHanako = sc.next();
         
         if(sTaro.compareTo(sHanako) < 0){
            iHanako += 3;
         }else if(sTaro.compareTo(sHanako) > 0){
            iTaro += 3;
         }else{
            iTaro ++;
            iHanako ++;
         }
      }  
      
      System.out.println(iTaro + " " + iHanako);    
         
   }//main
      
}//class
