import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String YM = sc.next();
   
   boolean YYMM = false;
   boolean MMYY = false;
   
   
   if(YM.charAt(0)=='0'){
    if(YM.charAt(1)!='0'){
     MMYY = true;
    }
   }
     
   if(YM.charAt(0)=='1'){
    if(YM.charAt(1)=='0' || YM.charAt(1)=='1' || YM.charAt(1)=='2'){
     MMYY = true;
    }     
   }

     
      if(YM.charAt(2)=='0'){
    if(YM.charAt(3)!='0'){
     YYMM = true;
    }
   }
     
   if(YM.charAt(2)=='1'){
    if(YM.charAt(3)=='0' || YM.charAt(3)=='1' || YM.charAt(3)=='2'){
     YYMM = true;
    }     
   }
     if(YYMM && MMYY){
         System.out.println("AMBIGUOUS");
     }
      else if(YYMM && !(MMYY)){
         System.out.println("YYMM");
     }
      else if(!(YYMM) && MMYY){
         System.out.println("MMYY");
     }
      else{
         System.out.println("NA");
     }
   
 }
}