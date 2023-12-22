import java.util.Scanner; 

class Main{

 public static void main(String[] args){

 Scanner scan = new Scanner(System.in);
   int FLG = 0;
   for (int N = scan.nextInt(); N > 0; N = N/10){
   if (N%10 == 7){
    FLG = 1;
     break;
   }
    }
  if (FLG == 0){  
  System.out.println("No");
  }
  
   else{
  System.out.println("Yes");
   }
 }
}