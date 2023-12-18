import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   String a=kbd.next();
      int[] retu = new int[6];
      for(int i=0;i<6;i++){
        int p=a.charAt(i);
        retu[i]=p;
   }
   if(retu[2]==retu[3]&&retu[4]==retu[5]){
     System.out.println("Yes");
   }else{
     System.out.println("No");
   }
   }
   }
