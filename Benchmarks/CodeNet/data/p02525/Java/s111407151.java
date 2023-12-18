import java.util.Scanner; 
 
public class Main { 
  public static void main(String[] args) {   
 Scanner sc = new Scanner(System.in);    
 while (true)
 {   
    int n = sc.nextInt();     
  if (n == 0) {
   break; 
  }      
 int[] scores = new int[n];      
 for (int i = 0; i < scores.length; i++) {         
	scores[i] = sc.nextInt();       
}       
double average = 0, variance = 0;
for (int j = 1;j<=n;j++ ){
average = (average + scores[j])/n;
}  
for (int m = 1;m<=n;m++){
	variance = (scores[m] - average)+variance;
}  
variance = variance/n;
  System.out.println(Math.sqrt(variance));     
}   
} 
} 