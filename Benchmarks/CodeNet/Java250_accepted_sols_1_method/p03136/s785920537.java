import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] array = new int[n];
      int sum = 0;
      int max = 0;
      for(int i = 0;i < n;i++){
      	array[i] = sc.nextInt();
        sum += array[i];
      }
      for(int i = 0;i < n;i++){
      	max = Math.max(array[i],max);
      }
      if(max < sum-max){
      	System.out.println("Yes");
      }else{
      	System.out.println("No");
      }
    }
}
