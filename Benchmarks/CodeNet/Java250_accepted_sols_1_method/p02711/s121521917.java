import java.util.*;

class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt(); //3桁の整数
      
      int N_3 = N/100;
      int N_2 = (N/10)%10;
      int N_1 = N%10;
      
      if( N_3 == 7)
        System.out.println("Yes");
      else{
      	if( N_2 == 7)
          System.out.println("Yes");
        else{
        	if(N_1 == 7)
              System.out.println("Yes");
          	else
              System.out.println("No");
        }
      }
      
    }
}