public class Main{
 public static void main(String[] args){
  int sum = new java.util.Scanner(System.in).nextInt();
  
  while(){
   int i = 1;
   int pay = 1000*i;
   if(pay >= sum){
    int oturi = pay - sum;
    break;
   }else{
    i++;
   }
  }
 
  System.out.println(oturi);
 }
}