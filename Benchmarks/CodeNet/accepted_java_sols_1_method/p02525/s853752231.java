import java.util.Scanner; 
public class Main { 
 public static void main(String[] args) { 
  
 Scanner sc = new Scanner(System.in); 
 while (true) { 
  int n = sc.nextInt(); 
  if (n == 0) { 
    break; 
    } 
  int[] scores = new int[n]; 
  double sum=0; 
  for (int i = 0; i < scores.length; i++) { 
    scores[i] = sc.nextInt(); 
    sum=sum+scores[i]; 
  } 
  double average = 0, variance = 0; 
  double x=0; 

  average=sum/n; 
  for(int i=0;i<scores.length;i++){ 
   x=x+Math.pow((scores[i]-average),2); 
  variance=x/n;
  } 

  
  System.out.printf("%.8f\n",Math.sqrt(variance)); 
 } 
 } 
}