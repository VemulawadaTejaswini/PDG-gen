import java.util.Scanner;
import java.lang.Math;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
		int div = 2;
		int count = 0;
		while(a >= div){
			if (a%div == 0){
				a/=div;
				count++;
              div++;
			}else{
			div++;
			}		
    }
      System.out.print(count);
    }
}