import java.util.*; 
public class Main{
public static void main(String ... string){
  Scanner sc = new Scanner(System.in); 
  int n = sc.nextInt(); 
  int c500 = n/500; 
  int r500 = n%500; 
  int c5 = r500/5; 
  System.out.println(c500*1000+c5*5); 
  }
}
