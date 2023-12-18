import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  while(true){
   int n = sc.nextInt();
   if(n == 0){
    break;
   }
   int[] scores = new int[n];
   double sum=0,average=0,variance=0;
   for(int i=0;i<scores.length;i++){
    scores[i] = sc.nextInt();
    sum += scores[i];
    average = sum/scores.length;
   }
   for(int i=0;i<scores.length;i++){
    variance += (scores[i] - average)*(scores[i] - average)/scores.length;
   }
   System.out.println(average);
   System.out.println(Math.sqrt(variance));
  }
 }
}