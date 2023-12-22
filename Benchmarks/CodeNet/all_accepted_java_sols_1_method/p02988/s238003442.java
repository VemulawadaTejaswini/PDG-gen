import java.util.*; 
 
public class Main{
  
  public static void main (String [] args){
    Scanner scanner = new Scanner(System.in);     
    int n = scanner.nextInt();
    int a [ ] = new int [n];
    int t = 0;
    
    for(int i = 0;i <n;i++) {
				a[i]=scanner.nextInt();
    }
    for(int i = 1; i < n-1; i++) {
      if((a[i-1] < a[i]) && (a[i] < a[i+1])){
        t++;  
      
      } else if ((a[i-1] > a[i]) && (a[i] > a[i+1])) {
        t++;
       
      }
    }
    System.out.println(t);  
    scanner.close();
  }
  
}