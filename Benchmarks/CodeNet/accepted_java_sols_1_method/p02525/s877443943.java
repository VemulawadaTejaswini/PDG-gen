import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
  while(true){
   int n = sc.nextInt();
   if(n == 0){ 
    break;
   }
   int[] scores = new int[n];
   int i;
   double sum1 = 0.0;
    for(i= 0; i < scores.length; i++){
     scores[i] = sc.nextInt();
     sum1 += scores[i];
    }
   double average = 0, variance = 0;
    average = sum1 / n;
   double sum2 = 0.0;
   for(i= 0; i< scores.length; i++){
    sum2 += Math.pow((scores[i]-average), 2);
   }
   variance = sum2 / n;
   System.out.println(Math.sqrt(variance));
  }
 }
}