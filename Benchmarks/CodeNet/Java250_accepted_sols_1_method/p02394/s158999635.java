import static java.lang.System.out;
 public class Main{
     public static void main(String[] args){
         String str = new java.util.Scanner(System.in).nextLine();
         String[] tmp = str.split(" ");
         int W = Integer.parseInt(tmp[0]);
         int H = Integer.parseInt(tmp[1]);
         int x = Integer.parseInt(tmp[2]);
         int y = Integer.parseInt(tmp[3]);
         int r = Integer.parseInt(tmp[4]);
 
         if(r <= x && x <= (W - r) && r <= y && y <= (H - r)){
             out.println("Yes");
         }
         else{
             out.println("No");                                                                                                             
         }
 
     }
 }