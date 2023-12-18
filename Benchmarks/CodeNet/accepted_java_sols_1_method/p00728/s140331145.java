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
     int Max = 0, Min = 1000, average = 0, S = 0;

     for(int i = 0; i < scores.length; i++){
	 if(scores[i]>Max){
             Max = scores[i];
         }
         if(scores[i]<Min){
             Min = scores[i];
	 }
     }
     for(int i = 0; i < scores.length; i++){
       S = S + scores[i];
     }
     S = S - Max - Min;
     average = S / (n-2);
 
     System.out.println(average);
  }
}
}