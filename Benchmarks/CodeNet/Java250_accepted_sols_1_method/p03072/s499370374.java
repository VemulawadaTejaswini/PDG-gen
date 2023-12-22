import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] array = new int[n];
      int count = 0;
      int sum = 1;
      for(int i = 0;i < n;i++){
      	array[i] = sc.nextInt();
      }
      for(int i = 1;i < n;i++){
      	for(int j = 0;j < i;j++){
        	if(array[i] >= array[j]) count++;
        }
        if(count == i) sum++;
        count = 0;
      }
      System.out.println(sum);
    }
}