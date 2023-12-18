import java.util.Scanner;

public class Main{
  public static void main(String[]args){
   try(Scanner sc = new Scanner(System.in)){
      while(ture){
       int n = sc.nextInt();
      if(n == 0){
	break;
      }
	int[]score = new int[n];
	for(i = 0;i < n;i++){
	scores[i] = sc.nextInt();
	}
	double average = 0,variance = 0;
	for(i = 0;i < n;i++){
	average = average+scores[i];
	}
	average = average/n;
	for(i = 0;i < n;i++){
	variance = (scores[i]-average)^2+variance;
	}
	variance = variance/n;
	System.out.println(Math.sqrt(variance));
     }   
   }
  }
}
