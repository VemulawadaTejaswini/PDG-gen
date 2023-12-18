import java.util.*;

class Main{
 Scanner sc = new Scanner(System.in);
 
 Main(){
  while(true){
   int H = sc.nextInt();
   int W = sc.nextInt();
   if ( H == 0 && W == 0 ) break;
   for (int i = 0; i < H; i++){
    for (int j = 0; j < W; j++){
     System.out.print("#");
    }
    System.out.printf("\n");
   }
   System.out.printf("\n");
  }
 }
 public static void main(String[] args){
  new Main();
 }
}

