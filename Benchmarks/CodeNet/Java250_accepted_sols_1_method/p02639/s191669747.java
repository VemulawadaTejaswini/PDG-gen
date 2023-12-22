import java.util.Scanner;
import java.lang.*;

public class Main{
 
	public static void main(String args[]){

      Scanner sc = new Scanner(System.in);
	int array[]  = new int[5];
	array[0] = sc.nextInt();
	array[1] = sc.nextInt();
	array[2] = sc.nextInt();
	array[3] = sc.nextInt();
	array[4] = sc.nextInt();



      for(int i = 0; i<5; i++){
      	if(array[i] == 0){
        	System.out.println(i+1);
        }
      
      
      }
      
      
      
    }      
}