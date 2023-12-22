import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int A = sc.nextInt();
      	int B = sc.nextInt();
     	int AB = sc.nextInt();
		int X = sc.nextInt();
      	int Y = sc.nextInt();
      	
        Long sum = (long) 0;
      	if(2*AB>=(A+B)){
          	sum = (long) (A*X+B*Y);
      		System.out.println(sum);
          	return;
        }
      
      	int min = X;
      	int max = Y;
      	int addpizza = B; 
      	
      	if(Y<X){
        	min = Y;
          	max = X;
          	addpizza = A; 
        }
      
        Long sum2 = (long) (2*AB*max);
      	sum = (long) (addpizza*(max-min)+2*(AB*min));
      	if(sum<sum2){
      		System.out.println(sum);
        }else{
          System.out.println(sum2);
        }
        return;
	}
}
