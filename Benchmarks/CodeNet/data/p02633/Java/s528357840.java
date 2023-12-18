import java.util.Scanner;

public class Main{
    public static main(String args[]){
        Scanner sc = new Scanner(System.in);
      
      	int x = sc.nextInt();
      
      	int a = 1;
      
      	int b = 0;
      	int k = 0;
        while(a == 0){
            k += 360;
        	a = k % x;
        }
          	b = k / x;
      
      	System.out.print(b);
    }
}