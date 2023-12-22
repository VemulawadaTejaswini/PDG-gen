import java.util.Scanner;

class Main{

 public static void main(String[] args){

 Scanner scan = new Scanner(System.in);

 int N = scan.nextInt();  
   if (N % 2 == 0){
  int O = N / 2;
     System.out.println(O);
   }
   
   else{
     int P = N / 2 + 1;
   System.out.println(P);
   
   }
   
   
 }
}
