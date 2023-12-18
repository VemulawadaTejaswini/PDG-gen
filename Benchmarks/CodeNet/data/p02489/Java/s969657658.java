import java.util.Scanner;
class Main{
 public static void main(String[] args){
  int[] in = new int[999];
  Scanner sc = new Scanner(System.in);
  for(int i = 0; ; i++){
   in[i]=sc.nextInt();
   if(in[i]==0){
    break;
   }
  }
  for(int i=0;;i++){
   if(in[i]!=0){
    System.out.print(in[i]);
    System.out.print(" ");
   } else {
    break;
   }
  }
 }
}