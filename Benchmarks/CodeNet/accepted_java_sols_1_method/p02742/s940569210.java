import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
  Scanner kbd = new Scanner(System.in);
   long h=kbd.nextLong();
   long w=kbd.nextLong();

   long x=h*w;
   if(h==1||w==1){
     System.out.println(1);
   }else if(x%2==0){
     System.out.println(x/2);
   }else{
     System.out.println((x+1)/2);
   }
}
}
