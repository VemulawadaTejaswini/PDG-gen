import java.util.*;

class Main{
	public static void main(String args[]){
      Scanner in = new Scanner(System.in);  
      int x = in.nextInt();
      int n = in.nextInt();
      int[] arr = new int[101];
      for (int i = 0; i < n; i++){
      	arr[in.nextInt()] = 1; 
      }
      int val1 = -1;
      int val2 = -1;
      for (int i = x; i < 101; i++)
        if (arr[i] == 0){
        	val1 = i;
            break;
        }
      
      for (int i = x; i > 0; i--)
        if (arr[i] == 0){
        	val2 = i;
            break;
        }
      
      System.out.println(Math.min(val1, val2));
    }
  
}
