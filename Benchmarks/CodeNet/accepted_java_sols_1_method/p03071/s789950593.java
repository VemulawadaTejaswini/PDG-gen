import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
        int b = scan.nextInt();
      
		int sum1 = 0;
		int a1 = a;
      	int b1 = b;
      
      	sum1=a1;
        a1=a1-1;
      
      	if(a1>=b1)
          sum1=sum1+a1;
        else
          sum1=sum1+b1;
       
      int sum2 = 0;
		int a2 = a;
      	int b2 = b;
      
      	sum2=b2;
        b2=b2-1;
      
      	if(a2>=b2)
          sum2=sum2+a2;
      else
        sum2=sum2+b2;
      
      
      if(sum1>=sum2)
        		System.out.println(sum1);
      else
        		System.out.println(sum2);
        
 
 
	}
}