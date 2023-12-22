import java.util.Scanner;
public class Main{
 public static void main(String[] Args){
   Scanner sc = new Scanner(System.in);
   int[] ant = new int[6]; 
   for(int i = 0;i<6;i++){
     ant[i] = Integer.parseInt(sc.next());
   }
   int result = 0;
   boolean hantei = false;
   for(int i = 0;i<5;i++){
     if(hantei){
       break;
     }
     for(int j = 0;j<i;j++){
       result = ant[i]-ant[j];
       if(result>ant[5]){
         hantei = true;
         break;
       }
     }
   }
   if(hantei){
     System.out.print(":(");
   }else{
     System.out.print("Yay!");
   }
 }
}