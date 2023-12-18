import java.util.Scanner;

class Main {
  public static void main(String[] args){ 
  Scanner scan = new Scanner(System.in);
  String[] input = scan.nextLine().split(" ");
  int a = Integer.parseInt(input[0]);
  int b = Integer.parseInt(input[1]);
  int c = Integer.parseInt(input[2]);
  int k = Integer.parseInt(input[3]);
   int out = 0;
   if((k>=a)){
   for(int i = a; i > 0; i--){
   out+=1;
   
   }
   
   for(int i = k-a-b; i > 0; i--){
   out+=-1;
   
   }
   } else {
   out = 1*k;
   }
   System.out.println(out);
  }


}