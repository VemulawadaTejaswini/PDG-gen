import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int r = sc.nextInt();
      int d = sc.nextInt();
      int x = sc.nextInt();
      int[] array = new int[10];
      array[0] = r*x-d;
      for(int i = 1;i < 10;i++){
      	array[i] = array[i-1]*r-d;
      }
      for(int i = 0;i < 10;i++){
      	System.out.println(array[i]);
      }
      
    }
}