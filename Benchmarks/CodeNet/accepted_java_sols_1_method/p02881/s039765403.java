import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        double roop = Math.sqrt(N);
      	double x = 1;
        double y;
      	double count = 0;
        while(x <= roop){
          if(N % x == 0){
            y = N / x;
            if(x + y - 2 < count || count == 0){
              count = x + y - 2.0;
            }
          }
          x += 1;
        }
		 System.out.println(Math.round(count));            
    }
}