import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
      	double n[] = new double[a];
      	double nam = 0;
      
      for(int i = 0;i < a;i++){
      	n[i] = in.nextInt();
      }
      Arrays.sort(n);
      
      for(int i = 0;i<a;i++){
       if(i==0){nam = (n[i]+n[i+1])/2;}
      else if(i>1){nam = (nam+n[i])/2;}
      }
      System.out.print(nam);
      
	}
}