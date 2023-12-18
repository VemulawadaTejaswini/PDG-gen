import java.util.Scanner;

public class Main{

  public static void main(String[] args){

   Scanner sc = new Scanner(System.in);
   while(true){
     int n = sc.nextInt();
     if(n == 0){ break; }
     int[]scores = new int[n];
     for(int i = 0;i < scores.length;i++){
       scores[i] = sc.nextInt();
     }
     double average = 0, variance = 0, S = 0, SS = 0;
     for(int i = 0; i < scores.length; i++){
        S = S + scores[i];
     }
     average = S / n;

     for(int i = 0; i < scores.length; i++){
        SS = SS + (scores[i]-average)*(scores[i]-average);
     }
     variance = SS / n;
     System.out.println(Math.sqrt(variance));
     }
   }
 }